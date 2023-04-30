package com.yalla.DMS.Models;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * 
 * @author S555425 : Ravi Yalla
 *
 */

@Entity
public class Trainer {
	
	
	@Id
	private int trainerId;
	private String trainerName;
	private String trainerAddress;
	/**
	 * @return the trainerId
	 */
	public int getTrainerId() {
		return trainerId;
	}
	/**
	 * @return the trainerName
	 */
	public String getTrainerName() {
		return trainerName;
	}
	/**
	 * @return the trainerAddress
	 */
	public String getTrainerAddress() {
		return trainerAddress;
	}
	/**
	 * @param trainerId the trainerId to set
	 */
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	/**
	 * @param trainerName the trainerName to set
	 */
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	/**
	 * @param trainerAddress the trainerAddress to set
	 */
	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerAddress=" + trainerAddress
				+ "]";
	}

	
	
	
	

}