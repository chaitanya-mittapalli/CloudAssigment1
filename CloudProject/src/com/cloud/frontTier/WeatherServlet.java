package com.cloud.frontTier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.*;

/**
 * Servlet implementation class WeatherServlet
 */
@WebServlet("/WeatherServlet")
public class WeatherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WeatherServlet() {
        super();
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Entering Weather Servlet");
		try 
		   {
	        // Get the customer value submitted from Customer.jsp page through HttpServletRequest object
	        String city=request.getParameter("city");
	        System.out.println(city);
	        URL url=new URL("http://api.openweathermap.org/data/2.5/weather?q="+city+
					"&units=metric&appid=389d1b704de0c0b2bd52a61c86508765");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String oString;
			JSONObject jsonObject = null;
			while((oString=br.readLine())!=null)
			{
				JSONParser jsonParser=new JSONParser();
				jsonObject=(JSONObject)jsonParser.parse(oString);
			}
			
	         
	        RequestDispatcher dispatcher=request.getRequestDispatcher("/Result.jsp");
	        //Set the instance into request.Then only the customer object 
	        //will be available in the Welcome.jsp page
	        request.setAttribute("info",jsonObject);
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
		        RequestDispatcher dispatcher=request.getRequestDispatcher("/index.jsp");
	          e.printStackTrace();
	      }	}

}
