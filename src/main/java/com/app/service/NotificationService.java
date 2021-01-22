package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Complaint;
import com.app.entity.Notification;
import com.app.exception.ComplaintNotFoundException;
import com.app.repo.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository notificationRepository;
	
	public void saveNotification(Complaint complaint) {
		
		Optional<Complaint> compOptional = Optional.ofNullable(complaint);
		
		if(!compOptional.isPresent()) {
			
			throw new ComplaintNotFoundException("Complaint object may empty");
		}
		
		Notification notification = new Notification();
		notification.setComplaintTitle(complaint.getComplaintTitle());
		notification.setComplaintAddress(complaint.getComplaintAddress());
		notification.setStatus(complaint.getUserComplaintStatus());
		notification.setUserId(complaint.getUserId());
		notification.setDeleteStatus("Active");
		
		notificationRepository.save(notification);
	}
	
	
	public List<Notification> getAllNotificationOnId(int userId) {
		
		List<Notification> notificationList = notificationRepository.findByUserIdAndDeleteStatus(userId,"Active");
		
		if(notificationList.isEmpty()) {
			
			throw new ComplaintNotFoundException("User id : "+userId+" is not exist");
		}
		
		return notificationList;
	}
	
	public Notification deleteNotification(int nId) {
		
		Notification notification = notificationRepository.findByNotificationId(nId);
		
		Optional<Notification> notiOptional = Optional.ofNullable(notification);
		
		if(!notiOptional.isPresent()) {
			
			throw new ComplaintNotFoundException("Notification id : "+nId+" is not exist");
		}
		
		notification.setDeleteStatus("In Active");
		
		return notification;
		
	}
	
	
	
	
	
	
	
}
