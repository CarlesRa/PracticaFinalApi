package com.carlesramos.services;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.glassfish.jersey.server.ResourceConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.carlesramos.hibernateutility.HibernateUtil;

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
	@Path("/insertar")
	public void insertCarta() {
		sFactory = HibernateUtil.getSessionFactory();
		session = sFactory.openSession();
		transaction = session.beginTransaction();
		Jugadores jugador = new Jugadores("Manol","manol@gmail.com","holaMundo",0,0,0);
		session.save(jugador);
		transaction.commit();
	}
	
}
