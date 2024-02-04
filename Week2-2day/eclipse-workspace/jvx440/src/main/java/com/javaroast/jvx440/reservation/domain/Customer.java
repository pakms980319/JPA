package com.javaroast.jvx440.reservation.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
	private String firstName;
	private String lastName;
	private Date birthDate;
	private String phone;
	private Address address;
}
