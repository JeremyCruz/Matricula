package com.pe.fico.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name = "users")
public class Users {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre no puede contener un número")
	@Column(length = 70, nullable = true)
	private String name;

	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre no puede contener un número")
	@Column(length = 70, nullable = true)
	private String lastName;

	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El numero de DNI no puede contener caracteres especiales")
	@Pattern(regexp = "[^A-Z]+", message = "El numero de DNI no puede contener letras")
	@Pattern(regexp = "[^a-z]+", message = "El numero de DNI no puede contener letras")
	@Size(min = 8, max = 8)
	@Column(length = 70, nullable = true)
	private String dniUser;

	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El numero de DNI no puede contener caracteres especiales")
	@Pattern(regexp = "[^A-Z]+", message = "El numero de DNI no puede contener letras")
	@Pattern(regexp = "[^a-z]+", message = "El numero de DNI no puede contener letras")
	@Column(length = 70, nullable = true)
	private String edadUser;

	@Column(length = 70)
	private String email;

	@Size(min = 9, max = 15)
	@Column(length = 9, unique = true)
	private String username;

	@Column(length = 200)
	private String password;

	private Boolean enabled;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private List<Role> roles;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDniUser() {
		return dniUser;
	}

	public void setDniUser(String dniUser) {
		this.dniUser = dniUser;
	}

	public String getEdadUser() {
		return edadUser;
	}

	public void setEdadUser(String edadUser) {
		this.edadUser = edadUser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}