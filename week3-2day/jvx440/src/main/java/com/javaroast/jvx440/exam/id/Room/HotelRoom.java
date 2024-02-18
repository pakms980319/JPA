package com.javaroast.jvx440.exam.id.Room;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "hotel_room")
@Getter
@Setter
@ToString
public class HotelRoom {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="room_num")
	private int roomNum;
	
	@Column(name="name")
	private String name;
	
	@Column(name="capacity")
	private int capacity;
	
	@Column(name="price")
	private double price;
	
	@Column(name="intro")
	private String intro;
	
	public HotelRoom() {
		super();
	}

	public HotelRoom(int roomNum, String name, int capacity, double price, String intro) {
		super();
		this.roomNum = roomNum;
		this.name = name;
		this.capacity = capacity;
		this.price = price;
		this.intro = intro;
	}
}
