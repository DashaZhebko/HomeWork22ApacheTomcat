package org.example.homework22apachetomcat;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();
        out.println("Hello world!");
    }
}