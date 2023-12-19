package bazaarService.view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bazaarService.models.Appointment;
import bazaarService.models.Company;
import bazaarService.models.Customer;
import bazaarService.models.FactoryUser;
import bazaarService.models.FactoryUserCompany;
import bazaarService.models.FactoryUserCustomer;
import bazaarService.models.User;

public class UtilSystem {
	
	public static class UtilSystemStatic{
		static FactoryUserCompany factoryUserCompany = new FactoryUserCompany();
		static FactoryUserCustomer factoryUserCustomer = new FactoryUserCustomer();
		static Company company = new Company();
		static Customer customer = new Customer();
	
		static Scanner sc = new Scanner(System.in);
		static int opt;
		static String optStr;
		static Long optLong;
		
		public static void bannerInicioBazaarSystem() {
			System.out.println("=================================================================================");
			System.out.println("|\t\t\tBIENVENIDO A 'BAZAAR SERVICES'\t                        |");
			System.out.println("=================================================================================");
		}
		
		public static void menu() {
			bannerInicioBazaarSystem();
			menuInter();
			bannerFinalBazaarSystem();
		}
		public static void bannerFinalBazaarSystem() {
			System.out.println("=================================================================================");
			System.out.println("|\t---------------DERECHOS RESERVADO xD By Emmanuel s.---------------\t|         ");
			System.out.println("=================================================================================");
		}
		public static void menuInter() {
			System.out.printf("%n%n");
			System.out.println("\t1. Crear una empresa.");
			System.out.println("\t2. Crear una cliente.");
			System.out.println("\t3. Ver servcios disponible.");
			System.out.println("\t4. Salir.");
			System.out.printf("%n%n");
			System.out.print("\toption:_ ");
			opt = sc.nextInt();
			System.out.println("=================================================================================");
			menuAction(opt);
		}
		
	
		public static void menuAction(int option) {
			
			
			switch(option) {
			case 1:
				
				 factoryUserCompany.createUser();
				menuInter();
				break;
			case 2:
				
				
				factoryUserCustomer.createUser();
				
				break;
			case 3:
				ArrayList<User> listUserCompany = (ArrayList<User>) factoryUserCompany.getUsers();
				List<User> listUserCustomer = factoryUserCustomer.getUsers();
				if(listUserCompany.size() > 0) {
					System.out.println("\tLISTA DE EMPRESAS REGISTRADAS");
					for(User u: listUserCompany) {
						int j = 0;
						System.out.printf("%d - %s : %n", ++j, u.getFullname());
						company = (Company) u;
						company.showServices();
						System.out.println("**\t\t**\t\t**\t\t**\t\t**\t\t**");
					}
					System.out.println("Total: " + listUserCompany.size());
					System.out.println("*- ¿Desea agendar una cita? (s = Si / n = No)");
					optStr = sc.next();
					if(optStr.equalsIgnoreCase("S")) {
						Appointment appointment = new Appointment();
						System.out.println("Introduzca el número de lista de la empresa:  ");
						opt = sc.nextInt();
						company = (Company) listUserCompany.get(opt-1);
						appointment.setCompany(company);
						appointment.showCompanyServices();
						System.out.println("Seleciona el servicio (ej:1): ");
						appointment.selectCompanyServices(opt);
						appointment.setApplicationDate(LocalDate.now());
						System.out.println("Por favor, establezca el fecha en que necesita la cita.\nLos datos deben ser numericos (Ejemplo: Día: 1, Mes: 02, Año: 2023). ");
						System.out.print("Día: ");
						int dia = sc.nextInt();
						System.out.print("Mes: ");
						int mes = sc.nextInt();
						System.out.print("Año: ");
						int anio = sc.nextInt();
						appointment.setDate(LocalDate.of(anio, mes, dia));
						System.out.print("Para terminar, recuerde debe estar registrado como CLIENTE; asi que, por favor, ingrese su código de cliente (id cliente): ");
						int idCustomer = sc.nextInt();
						customer = searchCustomer(idCustomer, listUserCustomer);
						appointment.setCustomer(customer);
						String nota = "Nota: Si el diseño es CARGADO/SOBRECARGADO tendrá un costo adicional del 10% sobre el precio base.(78000*10% COP)";
						appointment.setDeatils(nota);
						System.out.println("");
						System.out.printf("El pago total sería: %.2f COP %n\t(Recuerde que el pago lo realizará presencial en  la empresa %n.)", appointment.getPayment());
						System.out.println("");
						System.out.println("|------------\t------------\t------------\t------------\t------------|");
						System.out.println("\t==DATOS DE SU CITA==");
						System.out.println(appointment.toString());
						System.out.println("=================================================================================");
						menuInter();
						
					}
					
				}else{
					System.out.println("¡Lo siento, por ahora no hay empresas registrada!");
					System.out.println("¡Debería crear por lo menos una empresa!");
					System.out.println("|------------\t------------\t------------\t------------\t------------|");
					menuInter();
				}
				
				break;
			default:
				System.out.println("\t\t\t\tFin del Programa");
				break;
			}
				
		}
		
		public static Customer searchCustomer(int idCustomer, List<User> lista) {
			ArrayList<User> listCustomer = (ArrayList<User>) lista;
			for(User uc: listCustomer) {
				if(idCustomer == uc.getId().intValue()) {
					return (Customer) uc;
				}
			}

			System.out.println("¡Sory! Debes registrarte primero como cliente.");
			System.out.println("A continuación, llene los siguieste datos para registrarse.");
			Customer c = (Customer) factoryUserCustomer.createUser();
			return c;
		}
		
		
		
	}
}
