package com.helen.rest;

/**
 * Created by Helen on 2/3/2017.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/xml/customer")
public class XMLService {

    @GET
    @Path("/{pin}")
    @Produces(MediaType.APPLICATION_XML)
    public Customer getCustomerInXML(@PathParam("pin") int pin) {

        Customer customer = new Customer();
        customer.setName("helen");
        customer.setPin(pin);

        return customer;

    }

}
