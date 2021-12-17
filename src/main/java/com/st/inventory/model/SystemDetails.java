package com.st.inventory.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="system_details")
public class SystemDetails implements Serializable {
	
	private static final long serialVersionUID = -5397422024584492869L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="serial_no")
	private String serialNumber;	
	@Column(name="model")
	private String model;
	@Column(name="ram_size")
	private String ramSize;
	@Column(name="harddisk_size")
	private String hardDiskSize;
	@Column(name="processor")
	private String processor;
	
	public SystemDetails() {
		super();		
	}

	public SystemDetails(long id, String serialNumber, String model, String ramSize, String hardDiskSize,
			String processor) {
		super();
		this.id = id;
		this.serialNumber = serialNumber;
		this.model = model;
		this.ramSize = ramSize;
		this.hardDiskSize = hardDiskSize;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "SystemDetails [id=" + id + ", serialNumber=" + serialNumber + ", model=" + model + ", ramSize="
				+ ramSize + ", hardDiskSize=" + hardDiskSize + ", processor=" + processor + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}

	public String getHardDiskSize() {
		return hardDiskSize;
	}

	public void setHardDiskSize(String hardDiskSize) {
		this.hardDiskSize = hardDiskSize;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
}
