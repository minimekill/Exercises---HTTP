/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    public GenericResource() {
    }

    @GET
    @Path("default")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDefault() {
        return "{}";
    }

    @GET
    @Path("disallow")
    @Produces(MediaType.APPLICATION_JSON)
    public String getDisallowedCors() {
        return "{}";
    }

    @GET
    @Path("allow")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllowedCors() {

        String a = "{}";
        return Response.ok(a).header("Access-Control-Allow-Origin", "*").build();
        //return Response.ok(a).header("Access-Control-Allow-Methods", "GET,POST,DELETE,UPDATE").build();    
    }

    @GET
    @Path("proxycors")
    @Produces(MediaType.APPLICATION_JSON)
    public String getProxyCors() throws Exception {

        URL url = new URL("http://ip.jsontest.com/?alloworigin=true");
        HttpURLConnection qonn = (HttpURLConnection) url.openConnection();
        qonn.setRequestMethod("GET");
        qonn.setRequestProperty("User-Agent", "");

        StringBuilder result = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(qonn.getInputStream()));
        String line = "";
        while ((line = br.readLine()) != null) {
            result.append(line);
        }
        br.close();
        return result.toString();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
