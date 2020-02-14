package com.carlesramos.services;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.ResourceConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.carlesramos.hibernateutility.HibernateUtil;
import com.google.gson.Gson;

import model.Cartas;
import model.Jugadores;


@Path("/inicio")
public class PartidaApi extends ResourceConfig{
	
	//Variables hibernate
	private SessionFactory sFactory;
	private Session session;
	private Transaction transaction;
	
	
	//ArrayList<Cartas> cartas;
	
	//GET METHODS
	
	@GET
	@Path("/saluda")
	public String saluda() {
		return "Bienvenido!!";
	}
	
	
	//POST METHODS
	
	@POST
	@Path("/insertarJugador")
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertJugador(String jSonJugador){
		sFactory = HibernateUtil.getSessionFactory();
		session = sFactory.openSession();
		transaction = session.beginTransaction();
		Gson gson = new Gson();
		Jugadores jugador = gson.fromJson(jSonJugador, Jugadores.class);
		session.save(jugador);
		transaction.commit();
	}
}
