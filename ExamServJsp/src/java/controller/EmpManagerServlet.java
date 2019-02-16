/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class EmpManagerServlet extends HttpServlet {

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
            out.println("<title>Servlet EmpManagerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EmpManagerServlet at " + request.getContextPath() + "</h1>");
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

        String idString = request.getParameter("id");
        
        if(idString.equals("")){
            request.setAttribute("error", "Please input ID");
            request.getRequestDispatcher("employee.jsp").forward(request, response);
        }
        int idInterger = Integer.parseInt(idString);
        List<Employee> employeeList = employeeFacade.findAll();
        for (Employee employee : employeeList) {
            if(idInterger==employee.getId()){
                request.setAttribute("error", "Please input another ID");
                request.getRequestDispatcher("employee.jsp").forward(request, response);
            }
        }
        String fullname = request.getParameter("fullname");
        String birthday = request.getParameter("birthday");
        Date birthday1 = new Date();
        try {
            birthday1 = new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
        } catch (ParseException ex) {
            Logger.getLogger(EmpManagerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        String address = request.getParameter("address");
        String position = request.getParameter("position");
        String department = request.getParameter("department");

        Employee employee = new Employee(idInterger, fullname, birthday1, address, position, department);
        String action = request.getParameter("action");
        
        if (action.equals("Submit")) {
            if (fullname.equals("") || birthday.equals("") || address.equals("") || position.equals("") || department.equals("")) {
                request.setAttribute("error", "Please input all information");
                request.getRequestDispatcher("employee.jsp").forward(request, response);
            } else {
                employeeFacade.create(employee);
                request.setAttribute("getAllEmployee", employeeFacade.findAll());
                request.getRequestDispatcher("list.jsp").forward(request, response);
            }
        } else if (action.equals("Reset")) {
            request.getRequestDispatcher("employee.jsp").forward(request, response);
        }
        
        
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
