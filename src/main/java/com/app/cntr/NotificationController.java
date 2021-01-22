package com.app.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Notification;
import com.app.service.NotificationService;

@RestController
public class NotificationController {

	@Autowired
	private NotificationService notificationService;
	
	@CrossOrigin
	@GetMapping("/all-notification/{userId}")
	public List<Notification> getAllNotificationOnId(@PathVariable int userId) {
		
		return notificationService.getAllNotificationOnId(userId);
			
	}
	
	@CrossOrigin
	@PostMapping("/delete-notification/{nId}")
	public Notification deleteNotification(@PathVariable int nId) {
		
		return notificationService.deleteNotification(nId);
		
	}
	
	
}
