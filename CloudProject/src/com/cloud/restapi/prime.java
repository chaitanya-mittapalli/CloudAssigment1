package com.cloud.restapi;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.cloud.view.Customer;

@Path("/prime")
public class prime 
{
	@GET
	@Produces("application/json")
	public Response primeJsonGet(@QueryParam("number") int f,@QueryParam("name") String name)throws JSONException
	{
	JSONObject json=new JSONObject();
	Customer cust=new Customer();
	cust.setNumber(f);
	cust.setName(name);
	cust.validate(f);
	json.put("Number",cust.getNumber());
	json.put("UserName", cust.getName());
	if(cust.getPrime())
	{
		json.put("Result","Number is Prime");
	}
	else
	{
		json.put("Result","Number is not Prime");	
	}
	json.put("LogValue",cust.getLogValue(f));
	return Response.status(200).entity(json.toString()).build();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello()
	{
		return "Hello World";
	}
	
	@POST
	@Produces("application/json")
	public Response primeJsonPost(@FormParam("number") int f,@FormParam("name") String name)throws JSONException
	{
		JSONObject json=new JSONObject();
	System.out.println(f+"  "+name);	
	Customer cust=new Customer();
	cust.setNumber(f);
	cust.setName(name);
	cust.validate(f);
	json.put("Number",cust.getNumber());
	json.put("UserName", cust.getName());
	if(cust.getPrime())
	{
		json.put("Result","Number is Prime");
	}
	else
	{
		json.put("Result","Number is not Prime");	
	}
	json.put("LogValue",cust.getLogValue(f));
	return Response.status(200).entity(json.toString()).build();
	}
	

}
