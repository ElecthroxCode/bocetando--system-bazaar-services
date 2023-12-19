package bazaarService.models;


import java.util.Scanner;

public class FactoryUserCustomer extends FactoryUser{
	Scanner sc;
	@Override
	public User createUser() {
		sc = new Scanner(System.in);
		System.out.println("\tDATOS PERSONALES");
		System.out.println("NOMBRE COMPLETO:");
		String name = sc.nextLine();
		System.out.println("TÉLEFONO:");
		String phone = sc.nextLine();
		System.out.println("EMAIL:");
		String email = sc.nextLine();
		System.out.println("\tDIRECCIÓN O UBICACIÓN");
		System.out.println("Establezca la calle:");
		String street= sc.nextLine();
		System.out.println("Establezca el numero de casa/apto.:");
		String numHouse = sc.nextLine();
		System.out.println("Establezca el sector de residencia:");
		String sector = sc.nextLine();
		System.out.println("ID del CLIENTE:");
		Long id = sc.nextLong();
		
		user = new Customer(id, name, phone, email, new Address(street, numHouse, sector));
		addUser();
		return user;
	}
	@Override
	public void showUsers() {
		for(User u: users) {
			System.out.println(u.toString());
		}
		
	}

}
