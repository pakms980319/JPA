package com.javaroast.jvx440.reservation.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Room {
	private int roomNum;			// 객실번호
	private String name;			// 객실명
	private int capacity;			// 객실 수용인원
	private double price;			// 가격
	private String intro;			// 객실에 대한 소개
	
}
