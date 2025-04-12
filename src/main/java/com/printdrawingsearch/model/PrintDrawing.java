package com.printdrawingsearch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * The PrintDrawing class represents a print drawing entity in the system. It
 * contains all of the attributes related to the print drawing.
 */
@Entity
@Table(name = "printdrawings")
public class PrintDrawing {

	// Fields representing attributes of a print drawing
	@Column(name = "bearing_max")
	private String bearingMax;

	@Column(name = "bearing_min")
	private String bearingMin;

	@Column(name = "customer")
	private String customer;

	@Column(name = "customer_pin")
	private String customerPin;

	@Column(name = "customer_revision")
	private String customerRevision;

	@Column(name = "date")
	private String date;

	@Column(name = "date_created")
	private String dateCreated;

	@Column(name = "diameter_high")
	private float diameterMaxValue;

	@Column(name = "diameter_low")
	private float diameterMinValue;

	@Column(name = "dmg_drawing_path")
	private String dmgDrawingPath;

	@Column(name = "drawing_name")
	private String drawingName;

	@Column(name = "face_length_high")
	private float faceLengthMaxValue;

	@Column(name = "face_length_low")
	private float faceLengthMinValue;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "new_base_price")
	private String newBasePrice;

	@Column(name = "oem")
	private String oem;

	@Column(name = "originating_customer")
	private String originatingCustomer;

	@Column(name = "part_no")
	private String partNo;

	@Column(name = "pdf_path")
	private String pdfPath;

	@Column(name = "prev_part_no")
	private String prevPartNo;

	@Column(name = "product_code")
	private String productCode;

	@Column(name = "rev_number")
	private String revNumber;

	@Column(name = "scanned_path")
	private String scannedPath;

	@Column(name = "steps")
	private String steps;

	@Column(name = "subcontractor")
	private String subcontractor;

	@Column(name = "type")
	private String type;

	@Column(name = "xlsm_path")
	private String xlsmPath;

	@Column(name = "xlsx_path")
	private String xlsxPath;

	/**
	 * Default constructor initializing all fields to default values.
	 */
	public PrintDrawing() {
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

	/**
	 * Parameterized constructor to initialize the PrintDrawing object with given
	 * values.
	 *
	 * @param bearingMax          the maximum bearing
	 * @param bearingMin          the minimum bearing
	 * @param customer            the customer name
	 * @param customerPin         the customer PIN
	 * @param customerRevision    the customer revision
	 * @param date                the date
	 * @param dateCreated         the date created
	 * @param diameterMinValue    the low diameter
	 * @param diameterMaxValue    the high diameter
	 * @param dmgDrawingPath      the drawing path
	 * @param drawingName         the drawing name
	 * @param faceLengthMinValue  the low face length
	 * @param faceLengthMaxValue  the high face length
	 * @param newBasePrice        the new base price
	 * @param oem                 the OEM
	 * @param originatingCustomer the originating customer
	 * @param partNo              the part number
	 * @param pdfPath             the PDF path
	 * @param prevPartNo          the previous part number
	 * @param productCode         the product code
	 * @param revNumber           the revision number
	 * @param scannedPath         the scanned path
	 * @param steps               the steps
	 * @param subcontractor       the subcontractor
	 * @param type                the type
	 * @param xlsmPath            the XLSM path
	 * @param xlsxPath            the XLSX path
	 */
	public PrintDrawing(
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

}
