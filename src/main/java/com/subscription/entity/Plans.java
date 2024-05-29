package com.subscription.entity;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
public class Plans {

	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer planId;
	    private String planName;
	    @Column(length = 2000)
	    private String planDescription;
	    private Double planDiscountedPrice;
	    private Double planActualPrice;
	    
	    private Boolean isActive;

	    @CreationTimestamp
	    private LocalDateTime createdAt;

	    @UpdateTimestamp
	    private LocalDateTime updatedAt;

	    
	    
		public Boolean getIsActive() {
			return isActive;
		}
		public void setIsActive(Boolean isActive) {
			this.isActive = isActive;
		}
		public LocalDateTime getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}
		public LocalDateTime getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(LocalDateTime updatedAt) {
			this.updatedAt = updatedAt;
		}
		public Integer getPlanId() {
			return planId;
		}
		public void setPlanId(Integer planId) {
			this.planId = planId;
		}
		public String getPlanName() {
			return planName;
		}
		public void setPlanName(String planName) {
			this.planName = planName;
		}
		public String getPlanDescription() {
			return planDescription;
		}
		public void setPlanDescription(String planDescription) {
			this.planDescription = planDescription;
		}
		public Double getPlanDiscountedPrice() {
			return planDiscountedPrice;
		}
		public void setPlanDiscountedPrice(Double planDiscountedPrice) {
			this.planDiscountedPrice = planDiscountedPrice;
		}
		public Double getPlanActualPrice() {
			return planActualPrice;
		}
		public void setPlanActualPrice(Double planActualPrice) {
			this.planActualPrice = planActualPrice;
		}  
}
