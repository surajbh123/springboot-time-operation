package com.demo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.demo.entity.Booking;

@RestController
@RequestMapping("test")
public class TestController {
	
	@Autowired
	private BookingService bookingService;

	@GetMapping("/hello")
	public ResponseEntity<String> hello(){
		return ResponseEntity.status(HttpStatus.OK).body("hii");
	}
	
	@GetMapping("/book")
	public ResponseEntity<Booking> booking(@RequestBody BookingDto bookingDto){
		return ResponseEntity.status(HttpStatus.OK).body(this.bookingService.saveBooking(bookingDto));
	}
	
	@PostMapping("/between")
	public ResponseEntity<List<Booking>> findBetWeen(@RequestBody BookingDto bookingDto){
		return ResponseEntity.status(HttpStatus.OK).body(this.bookingService.bookingByDates(bookingDto));
	}
	
	
}
