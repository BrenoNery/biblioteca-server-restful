package br.com.dev.biblioteca.model;

import java.io.Serializable;

import javax.persistence.Entity;

public class Login implements Serializable {

	private static final long serialVersionUID = -3926193538604339026L;
	
	private String login;
	private  String password;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
