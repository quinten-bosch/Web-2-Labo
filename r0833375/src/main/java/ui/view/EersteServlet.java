package ui.view;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DynamischePagina")
public class EersteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<head>");


        out.println("<body>");

        out.println("<h1> YESS </h1>");
        out.println("<a href='index.html' id='home'> Home </h1></a>");
        out.println("<p id='dynamisch'>");
        out.println("Dit is een random getal tussen 0 en 9:");
        out.println(Math.floor(Math.random() * 10));
        out.println("</p>");
        out.println("</body>");


        out.println("</head>");
    }
}
