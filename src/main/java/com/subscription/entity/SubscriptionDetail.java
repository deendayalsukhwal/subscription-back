package com.subscription.entity;

import javax.persistence.*;

@Entity
public class SubscriptionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String status;
    @OneToOne
    private Plans product;
    @OneToOne
    private User user;
    private String transactionId;

    public SubscriptionDetail() {
        
    }

	public SubscriptionDetail(Integer id, String status, Plans product, User user, String transactionId) {
		super();
		Id = id;
		this.status = status;
		this.product = product;
		this.user = user;
		this.transactionId = transactionId;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Plans getProduct() {
		return product;
	}

	public void setProduct(Plans product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

    
}
