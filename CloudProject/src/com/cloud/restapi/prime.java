package com.cloud.restapi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.cloud.view.Customer;

@Path("/prime")
public class prime {
	@GET
	@Produces("application/json")
	public Response primeJsonGet(@QueryParam("number") int f, @QueryParam("name") String name) throws JSONException {
		JSONObject json = new JSONObject();
		Customer cust = new Customer();
		cust.setNumber(f);
		cust.setName(name);
		cust.validate(f);
		json.put("Number", cust.getNumber());
		json.put("UserName", cust.getName());
		if (cust.getPrime()) {
			json.put("Result", "Number is Prime");
		} else {
			json.put("Result", "Number is not Prime");
		}
		json.put("LogValue", cust.getLogValue(f));
		return Response.status(200).entity(json.toString()).build();
	}

	@POST
	@Produces("application/json")
	public Response primeJsonPost(@FormParam("number") int f, @FormParam("name") String name) throws JSONException {
		JSONObject json = new JSONObject();
		System.out.println(f + "  " + name);
		Customer cust = new Customer();
		cust.setNumber(f);
		cust.setName(name);
		cust.validate(f);
		json.put("Number", cust.getNumber());
		json.put("UserName", cust.getName());
		if (cust.getPrime()) {
			json.put("Result", "Number is Prime");
		} else {
			json.put("Result", "Number is not Prime");
		}
		json.put("LogValue", cust.getLogValue(f));
		return Response.status(200).entity(json.toString()).build();
	}
	
	

}
