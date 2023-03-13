package com.store.dto;

public class BranchDTO {
	
	private long brachId;
	private String branchName;
	private String branchDetails;
	private int branchPhone;
	public long getBrachId() {
		return brachId;
	}
	public void setBrachId(long brachId) {
		this.brachId = brachId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchDetails() {
		return branchDetails;
	}
	public void setBranchDetails(String branchDetails) {
		this.branchDetails = branchDetails;
	}
	public int getBranchPhone() {
		return branchPhone;
	}
	public void setBranchPhone(int branchPhone) {
		this.branchPhone = branchPhone;
	}
	@Override
	public String toString() {
		return "Branch [brachId=" + brachId + ", branchName=" + branchName + ", branchDetails=" + branchDetails
				+ ", branchPhone=" + branchPhone + "]";
	}
	
}
