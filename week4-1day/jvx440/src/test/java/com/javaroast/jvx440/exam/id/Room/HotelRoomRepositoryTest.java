package com.javaroast.jvx440.exam.id.Room;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.javaroast.jvx440.RoastTest;

import jakarta.transaction.Transactional;

public class HotelRoomRepositoryTest extends RoastTest {
	@Autowired
	private HotelRoomRepository hotelRoomRepo;
	
	@Test
	@Transactional
	public void save() {
		HotelRoom hotelRoom = new HotelRoom();
		
		hotelRoom.setRoomNum(17);
		hotelRoom.setName("홍길동");
		hotelRoom.setCapacity(2);
		hotelRoom.setPrice(57000);
		hotelRoom.setIntro("더블 베드, 무선 WIFI 제공");
		
		hotelRoomRepo.save(hotelRoom);
	}
	
}
