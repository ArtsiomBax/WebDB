package by.artbax.db.dao;

import by.artbax.db.models.Car;
import by.artbax.db.models.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class UsersDaoJdbcTemplateImpl implements UsersDao {

    private JdbcTemplate template;

    private final String SQL_SELECT_ALL = "SELECT * FROM java_user";
    private final String SQL_SELECT_ALL_BY_FIRST_NAME = "SELECT * FROM java_user WHERE first_name = ?";
    //language=SQL
    private final String SQL_SELECT_USER_WITH_CAR
            = "SELECT java_user.*, user_car.id as car_id, user_car.model FROM java_user LEFT JOIN user_car ON java_user.id = user_car.owner_id WHERE java_user.id = ?";
    ;

    private Map<Integer, User> usersMap = new HashMap<>();

    public UsersDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    private RowMapper<User> userRowMapper = (resultSet, i) -> {
        Integer id = resultSet.getInt("id");
        if (!usersMap.containsKey(id)) {

            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");

            User user = new User(id, firstName, lastName, new ArrayList<>());
            usersMap.put(id, user);
        }
        Car car = new Car(resultSet.getInt("car_id"),
                resultSet.getString("model"),
                usersMap.get(id));
        usersMap.get(id).getCars().add(car);
        return usersMap.get(id);

    };

    @Override
    public List<User> findAllByFirstName(String firstName) {
        return template.query(SQL_SELECT_ALL_BY_FIRST_NAME, userRowMapper, firstName);
    }

    @Override
    public Optional<User> find(Integer id) {
        template.query(SQL_SELECT_USER_WITH_CAR, userRowMapper, id);
        if(usersMap.containsKey(id)){
            return Optional.of(usersMap.get(id));
        }
            return  Optional.empty();


    }

    @Override
    public void save(User model) {

    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<User> findAll() {
        return template.query(SQL_SELECT_ALL, userRowMapper);
    }
}
