package ui.controller;

import domain.db.StudentDB;
import domain.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/StudentInfo")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<head>");


        out.println("<body>");


        out.println("<p id='dynamisch'>");
        out.println("Naam:");
        String naam = request.getParameter("naam");
        String voornaam = request.getParameter("voornaam");



        out.println(naam);
        out.println(voornaam);
        out.println("</p>");
        out.println("</body>");


        out.println("</head>");
    }
}
