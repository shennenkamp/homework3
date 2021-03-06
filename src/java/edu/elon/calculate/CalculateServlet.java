/*
 Copyright © 2016 Erik Borchers, Sarah Hennenkamp, and Wes Upham
 Copyright © 2014 Mike Murach
 */
package edu.elon.calculate;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CalculateServlet extends HttpServlet {

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
    doPost(request, response);
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
    String url = "/calculate.jsp";

    // get current action
    String action = request.getParameter("action");
    if (action == null) {
      action = "join";  // default action
    }

    // perform action and set URL to appropriate page
    if (action.equals("join")) {
      url = "/calculate.jsp";    // the "join" page
    } else if (action.equals("add")) {
      // get parameters from the request
      String amount = request.getParameter("Amount");
      String rate = request.getParameter("Rate");
      String years = request.getParameter("Years");

      // validate the parameters
      if (amount == null || rate == null || years == null
              || amount.isEmpty() || rate.isEmpty() || years.isEmpty()) {
        url = "/calculate.jsp";
      } else {
        url = "/results.jsp";
        //Make collected variables into doubles
        double amountd = Double.parseDouble(amount);
        double rated = Double.parseDouble(rate);
        double yearsd = Double.parseDouble(years);

        //Create a new user with the given variables
        User user = new User(amountd, rated, yearsd);

        //set that User attribute to the request object
        request.setAttribute("user", user);

        // store the User object in the session
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
      }

    }

    //Forward the request and response to a jsp page
    getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
  }

}
