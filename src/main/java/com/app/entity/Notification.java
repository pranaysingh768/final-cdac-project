package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@Table
@ToString
public class Notification {
	
	@Id
	@GeneratedValue
	@Column(name = "notification_id")
	private int notificationId;
	
	@Column(name = "complaint_title")
	private String complaintTitle;
	
	@Column(name = "complaint_address")
	private String complaintAddress;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "delete_status")
	private String deleteStatus;

	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notification(int notificationId, String complaintTitle, String complaintAddress, String status, int userId,
			String deleteStatus) {
		super();
		this.notificationId = notificationId;
		this.complaintTitle = complaintTitle;
		this.complaintAddress = complaintAddress;
		this.status = status;
		this.userId = userId;
		this.deleteStatus = deleteStatus;
	}

	public int getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(int notificationId) {
		this.notificationId = notificationId;
	}

	public String getComplaintTitle() {
		return complaintTitle;
	}

	public void setComplaintTitle(String complaintTitle) {
		this.complaintTitle = complaintTitle;
	}

	public String getComplaintAddress() {
		return complaintAddress;
	}

	public void setComplaintAddress(String complaintAddress) {
		this.complaintAddress = complaintAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(String deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	
	
}
