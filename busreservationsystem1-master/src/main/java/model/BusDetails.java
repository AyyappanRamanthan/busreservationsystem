package model;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "busdetails", catalog = "test")
public class BusDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bus_number")
    private Integer busNumber;
	
	@Column(name="operator_name")
	private String operatorName;
	
	@Column(name="source_city")
	private String sourceCity;
	
	@Column(name="dest_city")
	private String destCity;
	
	@Column(name="dep_date")
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date depDate;
	
	@JsonFormat(pattern="yyyy-mm-dd")
	@Column(name="arr_date")
	private Date arrDate;
	
	@Column(name="price")
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

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestCity() {
		return destCity;
	}

	public void setDestCity(String destCity) {
		this.destCity = destCity;
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

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public BusDetails() {
		
	}
	
	

}
