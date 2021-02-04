package com.demo.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.demo.entity.Booking;
import com.demo.demo.entity.User;

@Service
public class BookingService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BookingRepository bookingRepository;
	
	public Booking saveBooking(BookingDto booking) {
		User user = this.userRepository.findById(booking.getUserId()).get();
		return this.bookingRepository.save(new Booking(user,booking.getFromDate(),booking.getToDate()));
	}
	
	public List<Booking> bookingByDates(BookingDto bookingDto){
		System.out.println(bookingDto);
		return this.bookingRepository.findBookingByDate(bookingDto.getUserId(), bookingDto.getToDate(), bookingDto.getToDate());
	//	return this.bookingRepository.findAllByIdAndFromDateGreaterThanEqualAndToDateLessThanEqual(bookingDto.getUserId(), bookingDto.getToDate(), bookingDto.getToDate());
   //  return this.bookingRepository.findAll();
		// return this.bookingRepository.findBookingByDateJoin(this.userRepository.findById(bookingDto.getUserId()).get(), bookingDto.getToDate(), bookingDto.getToDate());
//	return this.bookingRepository.findByUser(this.userRepository.findById(bookingDto.getUserId()).get()).stream().filter(book -> 
//		 book.getToDate().isBefore(bookingDto.getToDate()) && book.getFromDate().isAfter(bookingDto.getFromDate())
// 	).collect(Collectors.toList());
	}
}
