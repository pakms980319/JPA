package com.javaroast.jvx440.engman.partner.repository;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import com.javaroast.jvx440.RoastTest;
import com.javaroast.jvx440.engman.common.domain.Address.Address;
import com.javaroast.jvx440.engman.common.domain.Address.AddressRepository;
import com.javaroast.jvx440.engman.partners.domain.Partner.Partner;
import com.javaroast.jvx440.engman.partners.domain.Partner.PartnerRepository;

public class ServiceTest extends RoastTest {
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private PartnerRepository partnerRepository;
	
	@Test
	@Transactional
	@Commit
	public void save() {
		Partner partner = new Partner();
		partner = partnerRepository.save(partner);
		
		Address address = new Address();
		address = addressRepository.save(address);
	}
	
	@Test
	public void getAllPartners() {
		partnerRepository.findAll().forEach(address -> System.out.println(address));
	}
	
	@Test
	public void getAllAddresses() {
		addressRepository.findAll().forEach(address -> System.out.println(address));
	}
	
	@Test
	public void getPartnerById() {
		String PartnerId = "";
		Optional<Partner> partner = partnerRepository.findById(PartnerId);
		System.out.println(partner.orElse(null));
	}
	
	@Test
	public void getAddressById() {
		String AddresId = "";
		Optional<Address> address = addressRepository.findById(AddresId);
		System.out.println(address.orElse(null));
	}
	
	private Date parseDate(String dateStr) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		ParsePosition pos = new ParsePosition(0);
		return format.parse(dateStr, pos);
	}
	
}
