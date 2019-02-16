/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Employee;
import java.awt.Dialog;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.EmployeeFacadeLocal;

/**
 *
 * @author phamq
 */
public class ManageServlet extends HttpServlet {

    @EJB
    private EmployeeFacadeLocal employeeFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ManageServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ManageServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
//STEP 1
        String empIdString = request.getParameter("empid");
        String empSalarySring = request.getParameter("salary");
        if(empIdString.equals("") || empSalarySring.equals("")){
            request.setAttribute("NoInput", "Input value defaut of Employee ID or Employee Salary");
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("admin.jsp");
            rd.forward(request, response);
        }
        int empidInterger = Integer.parseInt(empIdString);
        double empSalaryDouble = Double.parseDouble(empSalarySring);
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");
        
        Employee employee = new Employee(empidInterger, firstname, lastname, email, empSalaryDouble);
        String action = request.getParameter("action");
        if(action.equalsIgnoreCase("ADD")){
            employeeFacade.create(employee);
        } else if (action.equalsIgnoreCase("EDIT")){
            employeeFacade.edit(employee);
        } else if (action.equalsIgnoreCase("DELETE")){
            employeeFacade.remove(employee);
        } else if (action.equalsIgnoreCase("VIEW")){
            employee = employeeFacade.getEmployeeById(empidInterger);
            request.setAttribute("employee", employee);
        }
        
        request.setAttribute("getAllEmployee", employeeFacade.findAll());
        request.getRequestDispatcher("admin.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
