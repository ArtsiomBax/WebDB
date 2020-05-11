package by.artbax.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String kmAsString = request.getParameter("km");
        String kgAsString = request.getParameter("kg");

        int km = Integer.parseInt(kmAsString);
        double kg = Double.parseDouble(kgAsString);

       CostCalculator calc = new CostCalculator(500, 70);
       double cost = calc.calcCost(kg, km);
        PrintWriter print = response.getWriter();
        print.write("<H1>Cost: </H1>");
        print.write("<H2>" + cost + "</H2>");

    }
}
