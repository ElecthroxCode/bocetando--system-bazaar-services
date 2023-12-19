package bazaarService.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company extends User implements RolUser{
	Scanner sc = new Scanner(System.in);
	Scanner scan = new Scanner(System.in);
	private String manager;
	private String description;
	private String typeCompany;
	private List<CompanyService> services;
	

	public Company() {
		super();
	}

	public Company(Long id, String fullname, String phone, String email, Address address, String manager,
			String description, String typeCompany) {
		super(id, fullname, phone, email, address);
		this.manager = manager;
		this.description = description;
		this.typeCompany = typeCompany;
		this.services = new ArrayList<CompanyService>();
	}

	public void addService(String name, String description, double price) {
	
		CompanyService service = new CompanyService(name,description, price);
		System.out.println("*- ¿Vas a agregar fotos al " + service.getName() + "?(S = Si / N = No)");
		String op = sc.next();
		while(op.equalsIgnoreCase("S")) {
			String op2 = addPhotoService(op, service);
			if(!op2.equalsIgnoreCase("S")) {
				System.out.println("¡Se ha agregado el servicio "+service.getName()+" con exito!");
				System.out.println("Tu empresa tiene los siguiente servicios: ");
				showServices();
				System.out.println("=================================================================================");
				op = "N";
				}else {
					System.out.println("DATOS DE LA SIGUIENTE FOTO A INTRODUCIR EN EL SERVICIO " + service.getName() + ":");
					op = "S";
				}
			}
		}
	public String addPhotoService(String op, CompanyService service) {
		while(op.equalsIgnoreCase("S")){
			String op2, o;
			String idPhoto, titlePhoto, urlPhoto;
			System.out.print("Id de la foto: ");
					idPhoto = scan.nextLine();
					System.out.print("\nTitulo de la foto: ");
					titlePhoto = scan.nextLine();
					System.out.print("\nURL de la foto: ");
					urlPhoto = scan.nextLine();
					
			Photo photo = new Photo(idPhoto, titlePhoto, urlPhoto);
			System.out.println("El nivel de diseño es 'normal'. ¿Desea modificarlo a sobrecargado o cargado? (S = SI / N = NO)");
			o = scan.next();
			if(o.equalsIgnoreCase("s")) {
				String n;
				System.out.println("Defina 1 para CARGADO y 2 para SOBRECARGADO: ");
				n = scan.next();
				if(n.equalsIgnoreCase("1")) {
					photo.setDesignLevel("CARGADO");
					System.out.println("¡Se ha definido el nivel del diseño a CARGADO!");
					System.out.println("\t--");
				}
				if(n.equalsIgnoreCase("2")) {
					photo.setDesignLevel("SOBRECARGADO");
					System.out.println("¡Se ha definido el nivel del diseño a SOBRECARGADO!");
					System.out.println("\t--");
				}
			}
			service.addPhoto(photo);
			System.out.println("*- ¿Desea agregar otra foto? (S = SI / N = NO)");
			op2 = scan.next();
			if(op2.equalsIgnoreCase("N")){
				services.add(service);
			}
			System.out.println("=================================================================================");
			op = op2;
			scan.nextLine();
		}
		return op;
	}
	public void showServices() {
		int i = 0;
		for(CompanyService s: services) {
			System.out.printf( "%d - %s.%n", ++i, s);
		}
	}

	@Override
	public void updateRol(String rol) {
		setRol(rol);
		
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeCompany() {
		return typeCompany;
	}

	public void setTypeCompany(String typeCompany) {
		this.typeCompany = typeCompany;
	}

	public List<CompanyService> getServices() {
		return services;
	}

	public void setServices(List<CompanyService> services) {
		this.services = services;
	}

	@Override
	public String toString() {
		return "Company [" + super.toString() + "manager=" + manager + ", description=" + description + ", typeCompany=" + typeCompany
				+ ", services=" + services + "]";
	}

	

}
