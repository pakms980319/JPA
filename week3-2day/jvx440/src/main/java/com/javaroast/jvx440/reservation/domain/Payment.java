package com.javaroast.jvx440.reservation.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {
	private String cardNum;
	private String cardType;		// Visa, Master
	
}
