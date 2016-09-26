package com.cloud.frontTier;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cloud.view.Customer;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() 
    {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
        System.out.println("----- InsertCustomerServlet -----");
        
	  try 
	   {
        // Get the customer value submitted from Customer.jsp page through HttpServletRequest object
        String name=request.getParameter("name");
        String number=request.getParameter("number");
         
        //Set the Customer values into Customer Bean or POJO(Plain Old Java Object) class
        Customer customer=new Customer();
        customer.setName(name);
        customer.setNumber(Integer.parseInt(number));
        customer.validate(Integer.parseInt(number));
         
        RequestDispatcher dispatcher=request.getRequestDispatcher("/Welcome.jsp");
        //Set the customer instance into request.Then only the customer object 
        //will be available in the Welcome.jsp page
        request.setAttribute("cust",customer);
        dispatcher.forward(request, response);
	   } 
	  catch (ServletException e) 
	  {
          e.printStackTrace();
      }
	  catch (IOException e) 
	  {
          e.printStackTrace();
      }
	  catch(Exception e)
	  {
          e.printStackTrace();
      }
      
	}
}
