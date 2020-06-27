package model;

import java.util.Date;

public class ResponseDetails {
	
	private Integer busNumber;
	private String operatorName;
	private Date depDate;
	private Date arrDate;
	private Long duration;
	private Long price;
	public Integer getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(Integer busNumber) {
		this.busNumber = busNumber;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public Date getDepDate() {
		return depDate;
	}
	public void setDepDate(Date depDate) {
		this.depDate = depDate;
	}
	public Date getArrDate() {
		return arrDate;
	}
	public void setArrDate(Date arrDate) {
		this.arrDate = arrDate;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public ResponseDetails(Integer busNumber, String operatorName, Date depDate, Date arrDate, Long duration,
			Long price) {
		//super();
		this.busNumber = busNumber;
		this.operatorName = operatorName;
		this.depDate = depDate;
		this.arrDate = arrDate;
		this.duration = duration;
		this.price = price;
	}
	public ResponseDetails() {
		//super();
	}
	
	

}
