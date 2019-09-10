/**
 * 
 */
package com.robobank.csp.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author NarayanaSwamy Thota
 *
 */
public class Record {
	
	
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Long transactionReference;
	
	private String accountNumber;
	
	private Double startBalance;
	
	private String mutationSymbol;
	
	private Double mutationValue;
	
	private String description;
	
	private Double endBalance;

	public Long getTransactionReference() {
		// TODO Auto-generated method stub
		return null;
	}

	public Record(Long transactionReference, String accountNumber, Double startBalance, String mutationSymbol,
			Double mutationValue, String description, Double endBalance) {
		super();
		this.transactionReference = transactionReference;
		this.accountNumber = accountNumber;
		this.startBalance = startBalance;
		this.mutationSymbol = mutationSymbol;
		this.mutationValue = mutationValue;
		this.description = description;
		this.endBalance = endBalance;
	}

	@Override
	public String toString() {
		return "Record [transactionReference=" + transactionReference + ", accountNumber=" + accountNumber
				+ ", startBalance=" + startBalance + ", mutationSymbol=" + mutationSymbol + ", mutationValue="
				+ mutationValue + ", description=" + description + ", endBalance=" + endBalance
				+ ", getTransactionReference()=" + getTransactionReference() + ", getAccountNumber()="
				+ getAccountNumber() + ", getStartBalance()=" + getStartBalance() + ", getMutationSymbol()="
				+ getMutationSymbol() + ", getMutationValue()=" + getMutationValue() + ", getDescription()="
				+ getDescription() + ", getEndBalance()=" + getEndBalance() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getStartBalance() {
		return startBalance;
	}

	public void setStartBalance(Double startBalance) {
		this.startBalance = startBalance;
	}

	public String getMutationSymbol() {
		return mutationSymbol;
	}

	public void setMutationSymbol(String mutationSymbol) {
		this.mutationSymbol = mutationSymbol;
	}

	public Double getMutationValue() {
		return mutationValue;
	}

	public void setMutationValue(Double mutationValue) {
		this.mutationValue = mutationValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getEndBalance() {
		return endBalance;
	}

	public void setEndBalance(Double endBalance) {
		this.endBalance = endBalance;
	}

	public void setTransactionReference(Long transactionReference) {
		this.transactionReference = transactionReference;
	}

}
