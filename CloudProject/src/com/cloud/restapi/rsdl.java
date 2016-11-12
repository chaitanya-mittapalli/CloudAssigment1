package com.cloud.restapi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
@Path("/rsdl")
public class rsdl 
{
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String getRSDL() throws ParserConfigurationException, SAXException, IOException
	{
	  BufferedReader bufferedReader=new BufferedReader(new FileReader(new File(this.getClass().getResource("/wsdl.xml").getFile())));
	  String string;
	  StringBuilder stringBuilder=new StringBuilder();
	  while((string=bufferedReader.readLine())!=null)
	  {
		  stringBuilder.append(string.trim());
	  }
	  bufferedReader.close();
	 return stringBuilder.toString();
	}

}
