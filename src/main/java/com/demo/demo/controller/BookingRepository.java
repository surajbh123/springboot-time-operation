package com.demo.demo.controller;

import java.time.Instant;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.demo.entity.Booking;
import com.demo.demo.entity.User;

import org.springframework.data.jpa.repository.Query;


@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer>  {

	@Query("SELECT b FROM Booking b WHERE b.user.id = ?1 and b.fromDate >= ?2 and b.toDate <= ?3")
	List<Booking> findBookingByDate(int userId,Instant fromdDate,Instant toDate );
	
	List<Booking> findAllByIdAndFromDateGreaterThanEqualAndToDateLessThanEqual(int userId,Instant fromdDate,Instant toDate);
	
	@Query("SELECT b FROM Booking b WHERE b.user.id = ?1 ")
	List<Booking> findAllById(int userId);
	
//	@Query("SELECT b FROM Booking b WHERE b.user = ?1 and b.fromDate >= ?2 and b.toDate <= ?3")
//	List<Booking> findBookingByDateJoin(User user,Instant fromdDate,Instant toDate );
	
	List<Booking> findByUser(User user);
	

}


//@Query("SELECT a FROM Address a WHERE a.user.id = ?1")
//List<Address> getAllAddressById(int uid);
