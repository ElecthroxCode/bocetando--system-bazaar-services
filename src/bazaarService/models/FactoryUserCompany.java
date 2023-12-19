package bazaarService.models;

import java.util.Scanner;

public class FactoryUserCompany extends FactoryUser{
	Scanner sc;
	Scanner scStr;
	Company company;
	@Override
	public User createUser() {
		sc = new Scanner(System.in);
		System.out.println("\tDATOS DE LA EMPRESA");
		System.out.println("NOMBRE de la empresa:");
		String name = sc.nextLine();
		System.out.println("PHONE de la empresa:");
		String phone = sc.nextLine();
		System.out.println("EMAIL de la empresa:");
		String email = sc.nextLine();
		
		System.out.println("NOMBRE DEL MANAGER  de la empresa:");
		String manager= sc.nextLine();
		System.out.println("DESCRIPCIÓN de la empresa:");
		String description= sc.nextLine();
		System.out.println("Tipo/Rubro de la empresa:");
		String type= sc.nextLine();
		System.out.println("\tDIRECCIÓN O UBICACIÓN DE LA EMPRESA");
		System.out.println("Establezca la calle de residencia:");
		String street= sc.nextLine();
		System.out.println("Establezca el numero de residencia:");
		String numHouse = sc.nextLine();
		System.out.println("Establezca el sector de residencia:");
		String sector = sc.nextLine();
		System.out.println("ID de la empresa:");
		Long id = sc.nextLong();
		user = new Company(id, name, phone, email, new Address(street, numHouse, sector),
				manager, description, type);
		System.out.println("¿Quieres agregar los servicios que ofreces como empresa? (s = Si / n = No): ");
		String opt = sc.next();
		if(opt.equalsIgnoreCase("s")) {
			scStr = new Scanner(System.in);
			company = (Company) user;
			String nameService, descriptionService;
			double basePriceService;
			System.out.printf("Escriba el nombre del Servicio: ");
			nameService = scStr .nextLine();
			System.out.printf("%nEscriba la description del Servicio: ");
			descriptionService = scStr .nextLine();
			System.out.printf("%nEscriba el precio por el Servicio: ");
			basePriceService = scStr.nextDouble();
			company.addService(nameService, descriptionService, basePriceService);
			addUser();
			return company;
		}
		addUser();
		return user;
	}
	@Override
	public void showUsers() {
		for(User u : users) {
			System.out.println(u.toString());
		}
		
	}

}
