package ui.controller;


import domain.db.StudentDB;
import domain.model.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/StudentInfo")
public class Servlet extends HttpServlet {
    private StudentDB database = new StudentDB();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String voornaam = request.getParameter("name");
        String famillienaam = request.getParameter("family_name");
        Student result = database.FindStudent(voornaam,famillienaam);

        request.setAttribute("result", result);
        RequestDispatcher view;
        if(result != null){
            view = request.getRequestDispatcher("gevonden.jsp");
        }
        else{
            view = request.getRequestDispatcher("nietgevonden.jsp");
        }
        view.forward(request,response);

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}