package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification,Integer>{

	public List<Notification> findByUserIdAndDeleteStatus(int userId,String str);
		
	public Notification findByNotificationId(int nId); 
		
	
}
