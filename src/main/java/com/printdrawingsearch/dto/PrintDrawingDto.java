package com.printdrawingsearch.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The @JsonPropertyOrder annotation is used to define the order in which fields
 * are serialized to JSON when the object is returned in the API response.
 */
@JsonPropertyOrder({ "id", "drawingName", "customer", "oem", "diameterMinValue", "diameterMaxValue", "faceLengthMinValue",
		"faceLengthMaxValue", "bearingMin", "bearingMax", "customerPin", "customerRevision", "date", "dateCreated",
		"dmgDrawingPath", "id", "newBasePrice", "originatingCustomer", "partNo", "pdfPath", "prevPartNo", "productCode",
		"revNumber", "scannedPath", "steps", "subcontractor", "type", "xlsmPath", "xlsxPath" })

/**
 * The PrintDrawingDto class is a data transfer object that represents the Print
 * Drawing entity. This class is used to transfer data between different layers
 * of the application.
 */
public class PrintDrawingDto {

	/** 1 */
	private String bearingMax;
	/** 2 */
	private String bearingMin;
	/** 3 */
	private String customer;
	/** 4 */
	private String customerPin;
	/** 5 */
	private String customerRevision;
	/** 6 */
	private String date;
	/** 7 */
	private String dateCreated;
	/** 8 */
	private float diameterMaxValue;
	/** 9 */
	private float diameterMinValue;
	/** 10 */
	private String dmgDrawingPath;
	/** 11 */
	private String drawingName;

	/** 13 */
	private float faceLengthMaxValue;
	/** 14 */
	private float faceLengthMinValue;

	/** 15 */
	private int id;
	/** 16 */
	private String newBasePrice;
	/** 17 */
	private String oem;
	/** 18 */
	private String originatingCustomer;
	/** 19 */
	private String partNo;
	/** 20 */
	private String pdfPath;
	/** 21 */
	private String prevPartNo;
	/** 22 */
	private String productCode;
	/** 23 */
	private String revNumber;
	/** 24 */
	private String scannedPath;
	/** 25 */
	private String steps;
	/** 26 */
	private String subcontractor;
	/** 27 */
	private String type;
	/** 28 */
	private String xlsmPath;
	/** 29 */
	private String xlsxPath;

	public PrintDrawingDto() {
		// Initialize fields
		this.xlsxPath = "";
		this.xlsmPath = "";
		this.pdfPath = "";
		this.scannedPath = "";
		this.dmgDrawingPath = "";
		this.drawingName = "";
		this.revNumber = "";
		this.diameterMinValue = 0.0f;
		this.diameterMaxValue = 0.0f;
		this.faceLengthMinValue = 0.0f;
		this.faceLengthMaxValue = 0.0f;
		this.bearingMax = "";
		this.bearingMin = "";
		this.steps = "";
		this.oem = "";
		this.type = "";
		this.customer = "";
		this.originatingCustomer = "";
		this.customerPin = "";
		this.customerRevision = "";
		this.newBasePrice = "";
		this.date = "";
		this.subcontractor = "";
		this.productCode = "";
		this.prevPartNo = "";
		this.dateCreated = "";
		this.partNo = "";
	}

	public PrintDrawingDto(
			String bearingMax,
			String bearingMin,
			String customer,
			String customerPin,
			String customerRevision,
			String date,
			String dateCreated,
			float diameterMinValue,
			float diameterMaxValue,
			String dmgDrawingPath,
			String drawingName,

			float faceLengthMinValue,
			float faceLengthMaxValue,
			int id,
			String newBasePrice,
			String oem,
			String originatingCustomer,
			String partNo,
			String pdfPath,
			String prevPartNo,
			String productCode,
			String revNumber,
			String scannedPath,
			String steps,
			String subcontractor,
			String type,
			String xlsmPath,
			String xlsxPath) {
		super();
		this.bearingMax = bearingMax;
		this.bearingMin = bearingMin;
		this.customer = customer;
		this.customerPin = customerPin;
		this.customerRevision = customerRevision;
		this.date = date;
		this.dateCreated = dateCreated;
		this.diameterMinValue = diameterMinValue;
		this.diameterMaxValue = diameterMaxValue;
		this.dmgDrawingPath = dmgDrawingPath;
		this.drawingName = drawingName;

		this.faceLengthMinValue = faceLengthMinValue;
		this.faceLengthMaxValue = faceLengthMaxValue;
		this.id = id;
		this.newBasePrice = newBasePrice;
		this.oem = oem;
		this.originatingCustomer = originatingCustomer;
		this.partNo = partNo;
		this.pdfPath = pdfPath;
		this.prevPartNo = prevPartNo;
		this.productCode = productCode;
		this.revNumber = revNumber;
		this.scannedPath = scannedPath;
		this.steps = steps;
		this.subcontractor = subcontractor;
		this.type = type;
		this.xlsmPath = xlsmPath;
		this.xlsxPath = xlsxPath;
	}

	public String getBearingMax() {
		return bearingMax;
	}

	public String getBearingMin() {
		return bearingMin;
	}

	public String getCustomer() {
		return customer;
	}

	public String getCustomerPin() {
		return customerPin;
	}

	public String getCustomerRevision() {
		return customerRevision;
	}

	public String getDate() {
		return date;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public float getDiameterMaxValue() {
		return diameterMaxValue;
	}

	public float getDiameterMinValue() {
		return diameterMinValue;
	}

	public String getDmgDrawingPath() {
		return dmgDrawingPath;
	}

	public String getDrawingName() {
		return drawingName;
	}

	public float getFaceLengthMaxValue() {
		return faceLengthMaxValue;
	}

	public float getFaceLengthMinValue() {
		return faceLengthMinValue;
	}

	public int getId() {
		return id;
	}

	public String getNewBasePrice() {
		return newBasePrice;
	}

	public String getOem() {
		return oem;
	}

	public String getOriginatingCustomer() {
		return originatingCustomer;
	}

	public String getPartNo() {
		return partNo;
	}

	public String getPdfPath() {
		return pdfPath;
	}

	public String getPrevPartNo() {
		return prevPartNo;
	}

	public String getProductCode() {
		return productCode;
	}

	public String getRevNumber() {
		return revNumber;
	}

	public String getScannedPath() {
		return scannedPath;
	}

	public String getSteps() {
		return steps;
	}

	public String getSubcontractor() {
		return subcontractor;
	}

	public String getType() {
		return type;
	}

	public String getXlsmPath() {
		return xlsmPath;
	}

	public String getXlsxPath() {
		return xlsxPath;
	}

	public void setBearingMax(String bearingMax) {
		this.bearingMax = bearingMax;
	}

	public void setBearingMin(String bearingMin) {
		this.bearingMin = bearingMin;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public void setCustomerPin(String customerPin) {
		this.customerPin = customerPin;
	}

	public void setCustomerRevision(String customerRevision) {
		this.customerRevision = customerRevision;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void setDiameterMaxValue(float diameterMaxValue) {
		this.diameterMaxValue = diameterMaxValue;
	}

	public void setDiameterMinValue(float diameterMinValue) {
		this.diameterMinValue = diameterMinValue;
	}

	public void setDmgDrawingPath(String dmgDrawingPath) {
		this.dmgDrawingPath = dmgDrawingPath;
	}

	public void setDrawingName(String drawingName) {
		this.drawingName = drawingName;
	}

	public void setFaceLengthMaxValue(float faceLengthMaxValue) {
		this.faceLengthMaxValue = faceLengthMaxValue;
	}

	public void setFaceLengthMinValue(float faceLengthMinValue) {
		this.faceLengthMinValue = faceLengthMinValue;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNewBasePrice(String newBasePrice) {
		this.newBasePrice = newBasePrice;
	}

	public void setOem(String oem) {
		this.oem = oem;
	}

	public void setOriginatingCustomer(String originatingCustomer) {
		this.originatingCustomer = originatingCustomer;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public void setPdfPath(String pdfPath) {
		this.pdfPath = pdfPath;
	}

	public void setPrevPartNo(String prevPartNo) {
		this.prevPartNo = prevPartNo;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public void setRevNumber(String revNumber) {
		this.revNumber = revNumber;
	}

	public void setScannedPath(String scannedPath) {
		this.scannedPath = scannedPath;
	}

	public void setSteps(String steps) {
		this.steps = steps;
	}

	public void setSubcontractor(String subcontractor) {
		this.subcontractor = subcontractor;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setXlsmPath(String xlsmPath) {
		this.xlsmPath = xlsmPath;
	}

	public void setXlsxPath(String xlsxPath) {
		this.xlsxPath = xlsxPath;
	}

	@Override
	public String toString() {
		return "PrintDrawingDto [bearingMax=" + bearingMax + ", bearingMin=" + bearingMin + ", customer=" + customer +
				", customerPin=" + customerPin + ", customerRevision=" + customerRevision + ", date=" + date + ", dateCreated=" +
				dateCreated + ", diameterMaxValue=" + diameterMaxValue + ", diameterMinValue=" + diameterMinValue +
				", dmgDrawingPath=" + dmgDrawingPath + ", drawingName=" + drawingName + ", faceLengthMaxValue=" +
				faceLengthMaxValue + ", faceLengthMinValue=" + faceLengthMinValue + ", id=" + id + ", newBasePrice=" +
				newBasePrice + ", oem=" + oem + ", originatingCustomer=" + originatingCustomer + ", partNo=" + partNo +
				", pdfPath=" + pdfPath + ", prevPartNo=" + prevPartNo + ", productCode=" + productCode + ", revNumber=" +
				revNumber + ", scannedPath=" + scannedPath + ", steps=" + steps + ", subcontractor=" + subcontractor + ", type=" +
				type + ", xlsmPath=" + xlsmPath + ", xlsxPath=" + xlsxPath + ", getBearingMax()=" + getBearingMax() +
				", getBearingMin()=" + getBearingMin() + ", getCustomer()=" + getCustomer() + ", getCustomerPin()=" +
				getCustomerPin() + ", getCustomerRevision()=" + getCustomerRevision() + ", getDate()=" + getDate() +
				", getDateCreated()=" + getDateCreated() + ", getDiameterMaxValue()=" + getDiameterMaxValue() +
				", getDiameterMinValue()=" + getDiameterMinValue() + ", getDmgDrawingPath()=" + getDmgDrawingPath() +
				", getDrawingName()=" + getDrawingName() + ", getFaceLengthMaxValue()=" + getFaceLengthMaxValue() +
				", getFaceLengthMinValue()=" + getFaceLengthMinValue() + ", getId()=" + getId() + ", getNewBasePrice()=" +
				getNewBasePrice() + ", getOem()=" + getOem() + ", getOriginatingCustomer()=" + getOriginatingCustomer() +
				", getPartNo()=" + getPartNo() + ", getPdfPath()=" + getPdfPath() + ", getPrevPartNo()=" + getPrevPartNo() +
				", getProductCode()=" + getProductCode() + ", getRevNumber()=" + getRevNumber() + ", getScannedPath()=" +
				getScannedPath() + ", getSteps()=" + getSteps() + ", getSubcontractor()=" + getSubcontractor() + ", getType()=" +
				getType() + ", getXlsmPath()=" + getXlsmPath() + ", getXlsxPath()=" + getXlsxPath() + ", getClass()=" +
				getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
