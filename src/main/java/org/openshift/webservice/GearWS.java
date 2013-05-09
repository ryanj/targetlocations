package org.openshift.webservice;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.openshift.haproxy.Gear;


@RequestScoped
@Path("/gears")
public class GearWS {
	
	//get all the parks
	@GET()
	@Produces("application/json")
	public List getAllGears(){
		return new ArrayList<Gear>();
	}
	
/****** Just for testing purposes ***********/	
	@GET()
	@Path("/gears/test")
	@Produces("text/plain")
	public String sayHello() {
		System.out.println("Where is this getting written");
	    return "Hello World In Both Places";
	}

}
