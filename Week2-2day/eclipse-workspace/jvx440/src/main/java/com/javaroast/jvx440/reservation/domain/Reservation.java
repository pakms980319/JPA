package com.javaroast.jvx440.reservation.domain;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/*
 * 예약정보
 */

@Getter
@Setter
public class Reservation {
	private String reservationNum;			// 예약번호
	private Date arrivalDate;				// 도착날짜
	private Date departureDate;				// 출발날짜
	private char status;					// 예약상태 (H(Holding)...)
	
	private Customer customer;				// 예약자
	private Payment payment;				// 결제정보
	private List<Room> roomList;			// 예약 객실
	
}
