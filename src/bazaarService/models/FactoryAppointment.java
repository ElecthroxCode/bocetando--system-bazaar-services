package bazaarService.models;


import java.time.LocalDate;
import java.util.ArrayList;

public abstract class FactoryAppointment {
	protected Company company;
	protected Customer customer;
	protected int idAppointment;
	protected LocalDate applicationDate;
	protected LocalDate date;
	protected String deatils;
	protected double payment;
	
	public FactoryAppointment() {
		super();
	}
	

	public FactoryAppointment(int idAppointment, LocalDate applicationDate, LocalDate date, String deatils) {
		super();
		this.idAppointment = idAppointment;
		this.applicationDate = applicationDate;
		this.date = date;
		this.deatils = deatils;
	}


	public abstract void showCompanyServices();
	public abstract void selectCompanyServices(int n);
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LocalDate getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDeatils() {
		return deatils;
	}
	public void setDeatils(String deatils) {
		this.deatils = deatils;
	}
	
	public double getPayment() {
		return payment;
	}

	public void setPaymentServices(double... priceService) {
		double totalPayment = 0.0;
		for(double p: priceService) {
			totalPayment += p;
		}
		this.payment = totalPayment;
	}



	
}
