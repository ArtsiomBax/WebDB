package by.artbax.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("<H1>Hello WORLD!!!</H1>");
        writer.write("<H2>I'm the BEST!</H2>");
        writer.write("<H3>HO-HO-HO!!!</H3>");
        writer.write("<H1>ArtBax Corporacion</H1>");
        writer.write("<H3>HO-HO-HO!!!</H3>");
    }
}
