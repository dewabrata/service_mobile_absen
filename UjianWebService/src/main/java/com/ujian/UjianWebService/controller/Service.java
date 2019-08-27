package com.ujian.UjianWebService.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Service {

	private final EntityManagerFactory emf;
	
	public Service() {
		emf = Persistence.createEntityManagerFactory("com.ujian.ujianwebservice");
		
	}
	
	public static Service getInstance() {
		return ServiceHolder.INSTANCE;
	}
	
	public static class ServiceHolder {
		private static final Service INSTANCE = new Service();
	}
	
	public EntityManagerFactory getEntityManager() {
		return emf;
	}
	
}
