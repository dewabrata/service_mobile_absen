package com.ujian.UjianWebService.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


import com.ujian.UjianWebService.model.Group;
import com.ujian.UjianWebService.model.Personel;
import com.ujian.UjianWebService.model.Position;
import com.ujian.UjianWebService.model.User;

public class Controller {

	EntityManager em;
	User user;
	Personel personnel;
	Position position;
	Group groups;

	private Controller() {
		em = Service.getInstance().getEntityManager().createEntityManager();

	}

	public static Controller getInstance() {
		return ControllerHolder.INSTANCE;
	}

	public static class ControllerHolder {
		private static final Controller INSTANCE = new Controller();
	}

	public void addDataUser() {
		user = new User();
		user.setId(2);
		user.setUsername("Aldi");
		user.setEmail("aldi@klien1.co.id");
		
		groups = new Group();
		groups.setId(1);
		groups.setCode("RGU1-PJK1-KLN1-KCB1-JN1");
		groups.setName("Regu 1 (PJK1-KLN1-KCB1-JN1)");
		groups.setProjectId(1);
		groups.setMinimumPersonnel(5);
		groups.setDescription("Regu 1 - PJK1 - KLN1 - KCB1 - JN1");
		groups.setAttendanceQrCode("abcdefghijklmnopqrstuvwxyz");
		groups.setStatus(1);
		
		position = new Position();
		position.setId(2);
		position.setCode("PROGRAMMER");
		position.setName("programmer");
		position.setDescription("programmer");
		position.setStatus(1);
		position.setCreatedByUserId(1);
		position.setCreatedAt("2019-04-23 05:38:50");
		position.setUpdatedByUserId(null);
		position.setUpdatedAt(null);
		position.setDeletedByUserId(null);
		position.setDeletedAt(null);
		
		
		
		
		personnel = new Personel();
		personnel.setId(1);
		personnel.setCode("PERSONNEL/PROGRAMMER1");
		personnel.setPhotoUrl("http://localhost/storage/JN1/programmer/profile/D0JH0sJ1X2Kf0D7nqlPPhM4oNw0oKOTS9cwZqhI2.jpeg");
		personnel.setFirstName("Johar");
		personnel.setMiddleName("Adi");
		personnel.setLastName("Budi1");
		personnel.setCompleteName("Johar Adi Budi1");
		personnel.setGender("Laki-laki");
		personnel.setHeight("176cm");
		personnel.setWeight("80Kg");
		personnel.setDob("17 November 1995");
		personnel.setPob("Jakarta");
		personnel.setHp("085712345667");
		personnel.setAddress("Jl. Klien 1");
		personnel.setFirebaseToken("123456");
		personnel.setDeviceId("Nomor IMEI");
		personnel.setUser(user);
		personnel.setPosition(position);
		personnel.setGroup(groups);
		
		groups.setPersonel(personnel);
		position.setPersonel(personnel);
		
		
		
		em.getTransaction().begin();
		
		em.merge(personnel);
		
		em.getTransaction().commit();

	}

	public List<User> getAllUser() {

		TypedQuery<User> query = em.createQuery("SELECT e from User e", User.class);
		return query.getResultList();
	}
	
	public User getSingleUser(int id) {

		User result = em.find(User.class,id );
		return result;
	}

	public List<Personel> getAllPersonel() {

		TypedQuery<Personel> query = em.createQuery("SELECT e from Personel e", Personel.class);
		return query.getResultList();
	}
	
	public List<Position> getAllPosition() {

		TypedQuery<Position> query = em.createQuery("SELECT e from Position e", Position.class);
		return query.getResultList();
	}
	
	public List<Group> getAllGroup() {

		TypedQuery<Group> query = em.createQuery("SELECT e from Group e", Group.class);
		return query.getResultList();
	}
	

//	public boolean Login(String username, String password) {
//
//		Petugas result = em.find(Petugas.class, username);
//
//		if (result != null) {
//			if (result.getPassword().equals(password)) {
//				return true;
//			} else {
//				return false;
//			}
//		} else {
//			return false;
//		}
//
//	}
//	public boolean checkPassword(String username, String password) {
//
//		TypedQuery<Petugas> query = em.createQuery(
//				"select a from Petugas a where a.kodePetugas = '" + username + "' and a.password ='" + password + "'",
//				Petugas.class);
//
//		int row = query.getResultList().size();
//
//		if (row > 0) {
//			return true;
//		} else {
//			return false;
//		}
//
//	}
//
//	public Petugas checkPassword2(String username, String password) {
//
//		TypedQuery<Petugas> query = em.createQuery(
//				"select a from Petugas a where a.kodePetugas = '" + username + "' and a.password ='" + password + "'",
//				Petugas.class);
//
//		return query.getSingleResult();
//
//	}
}
