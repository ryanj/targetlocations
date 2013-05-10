package org.openshift.webservice;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.openshift.haproxy.Gear;
import org.openshift.haproxy.GearParser;


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
	@Path("/test")
	@Produces("application/json")
	public ArrayList<Gear> sayHello() {
		String URL = new String("http://" + System.getenv("OPENSHIFT_GEAR_DNS") + "/haproxy-status/;csv");
		System.out.println("URL: " + URL);
		ArrayList<Gear> gears = new ArrayList<Gear>();
		GearParser gearParser = new GearParser(URL);
		gears = gearParser.getGears();
		
	    return (gears);
	}

}
