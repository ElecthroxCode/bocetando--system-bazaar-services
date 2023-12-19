package bazaarService.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Appointment extends FactoryAppointment{
	Scanner scanner;
	public Appointment() {
		super();
	}
	
	
	public Appointment(int idAppointment, LocalDate applicationDate, LocalDate date, String deatils) {
		super(idAppointment, applicationDate, date, deatils);
	}


	@Override
	public void showCompanyServices() {
		company.showServices();
		
	}
	@Override
	public void selectCompanyServices(int n) {
		scanner = new Scanner(System.in);
		String nivel;
		int index = n-1;
		ArrayList<CompanyService> listCompanyService = (ArrayList<CompanyService>) company.getServices();
		if(listCompanyService.contains(listCompanyService.get(index))) {
			System.out.printf("Escriba el código del diseño (id foto) que desea: ");
			nivel = scanner.nextLine();
			System.out.println("");
			if(listCompanyService.get(index).getDesignLevelPhoto(nivel).equalsIgnoreCase("sobrecargado") 
					|| listCompanyService.get(index).getDesignLevelPhoto(nivel).equalsIgnoreCase("cargado")) {
				double  factorDesign = 1.1;
				setPaymentServices(listCompanyService.get(index).getPrice()*factorDesign);
			}else {
				setPaymentServices(listCompanyService.get(index).getPrice());
			}
		}
	}


	@Override
	public String toString() {
		return " CITA: [company=" + company + ", customer=" + customer + ", idAppointment=" + idAppointment
				+ ", applicationDate=" + applicationDate + ", date=" + date + ", deatils=" + deatils + ", payment="
				+ payment + "]";
	}

}
