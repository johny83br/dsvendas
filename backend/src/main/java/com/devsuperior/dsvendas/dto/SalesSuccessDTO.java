package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SalesSuccessDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Long visited;
	private Long dels;
	
	public SalesSuccessDTO() {
		
	}

	public SalesSuccessDTO(Seller seller, Long visited, Long dels) {
		this.sellerName = seller.getName();
		this.visited = visited;
		this.dels = dels;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDels() {
		return dels;
	}

	public void setDels(Long dels) {
		this.dels = dels;
	}
	
	
}
