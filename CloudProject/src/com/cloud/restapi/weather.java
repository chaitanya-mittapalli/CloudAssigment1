package com.cloud.restapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@Path("weather")
public class weather 
{


	@GET
	@Produces("application/json")
	public Response getWeatherGet(@QueryParam("city")String city) throws IOException, ParseException
	{
		String value="";
		try
		{
		URL url=new URL("http://api.openweathermap.org/data/2.5/weather?q="+city+
				"&units=metric&appid=389d1b704de0c0b2bd52a61c86508765");
		HttpURLConnection conn=(HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
		String oString;
		while((oString=br.readLine())!=null)
		{
			JSONParser jsonParser=new JSONParser();
			JSONObject jsonObject=(JSONObject)jsonParser.parse(oString);
			value=jsonObject.toString();
		}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return Response.status(200).entity(value).build();
	}
	@POST
	@Produces("application/json")
	public Response getWeatherPost(@QueryParam("city")String city) throws IOException, ParseException
	{
		String value="";
		try
		{
			URL url=new URL("http://api.openweathermap.org/data/2.5/weather?q="+city+
					"&units=metric&appid=389d1b704de0c0b2bd52a61c86508765");
			HttpURLConnection conn=(HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String oString;
			while((oString=br.readLine())!=null)
			{
				JSONParser jsonParser=new JSONParser();
				JSONObject jsonObject=(JSONObject)jsonParser.parse(oString);
				value=jsonObject.toString();
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return Response.status(200).entity(value).build();
	}
		
}