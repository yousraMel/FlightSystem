package com.formation;

//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.Month;
//import java.util.ArrayList;
//import java.util.List;

//import com.formation.dao.CompanyDao;
//import com.formation.dao.FlightDao;
//import com.formation.dao.GenericDao;
//import com.formation.dao.PassengerDao;
import com.formation.dao.PilotDao;
//import com.formation.dao.PlaneDao;
//import com.formation.dao.SeatDao;
//import com.formation.dao.TicketDao;
import com.formation.idao.IGenericDao;
//import com.formation.idao.iTicketDao;
//import com.formation.models.Address;
//import com.formation.models.Company;
//import com.formation.models.Flight;
//import com.formation.models.Passenger;
import com.formation.models.Pilot;
//import com.formation.models.Plane;
//import com.formation.models.Seat;
//import com.formation.models.Ticket;

public class Application {

	public static void main(String[] args) {
//
//		IGenericDao<Passenger> daoPas = new PassengerDao();
//		IGenericDao<Plane> daoPl = new PlaneDao();
//		IGenericDao<Flight> daoFl = new FlightDao();
//		IGenericDao<Company> daoComp = new CompanyDao();
		IGenericDao<Pilot> daoPlt = new PilotDao();
//		IGenericDao<Seat> daoSt = new SeatDao();
//		IGenericDao<Ticket> daoTck = new TicketDao();
//		iTicketDao daoTckdao = new TicketDao();
//		LocalDate birthDate = LocalDate.of(1994, Month.MARCH, 05);
//		LocalDate birthDate1 = LocalDate.of(1992, Month.APRIL, 22);
//		LocalDate birthDate2 = LocalDate.of(1994, Month.SEPTEMBER, 12);
//		LocalDate birthDate3 = LocalDate.of(1990, Month.AUGUST, 7);
//		LocalDate departureDate = LocalDate.of(2019, Month.NOVEMBER, 23);
//		LocalDate arrivalDate = LocalDate.of(2019, Month.NOVEMBER, 24);
//		LocalTime departureTime = LocalTime.of(18, 00);
//		LocalTime arrivalTime = LocalTime.of(00, 05);
//		LocalDate departureDate1 = LocalDate.of(2019, Month.NOVEMBER, 02);
//		LocalDate arrivalDate1 = LocalDate.of(2019, Month.NOVEMBER, 02);
//		LocalTime departureTime1 = LocalTime.of(06, 15);
//		LocalTime arrivalTime1 = LocalTime.of(12, 35);
//		LocalDate departureDate2 = LocalDate.of(2019, Month.NOVEMBER, 01);
//		LocalDate arrivalDate2 = LocalDate.of(2019, Month.NOVEMBER, 01);
//		LocalTime departureTime2 = LocalTime.of(8, 25);
//		LocalTime arrivalTime2 = LocalTime.of(10, 15);
//		LocalDate departureDate4 = LocalDate.of(2019, Month.DECEMBER, 23);
//		LocalDate arrivalDate4 = LocalDate.of(2019, Month.DECEMBER, 24);
//		LocalTime departureTime4 = LocalTime.of(18, 00);
//		LocalTime arrivalTime4 = LocalTime.of(00, 05);
//		Address addressPas = new Address("Egypt", "Caire", "Qods", 23);
//		Address addressPas1 = new Address("Morocco", "Casa", "nakhil", 12);
//		Address addressPas2 = new Address("Morocco", "Casa", "menzeh", 05);
//		Address addressPas3 = new Address("Morocco", "Casa", "alfath", 25);
		
//		
//		LocalDate emmissionDate = LocalDate.of(2019, Month.SEPTEMBER, 1);
//		LocalDate reservationDate = LocalDate.of(2019, Month.SEPTEMBER, 12);
//		LocalDate paymentDate = LocalDate.of(2019, Month.SEPTEMBER, 15);
		
//		LocalDate emmissionDate4 = LocalDate.of(2019, Month.OCTOBER, 1);
//		LocalDate reservationDate4 = LocalDate.of(2019, Month.OCTOBER, 12);
//		LocalDate paymentDate4 = LocalDate.of(2019, Month.OCTOBER, 15);
		
//		LocalDate reservationDate1 = LocalDate.of(2019, Month.OCTOBER, 23);
//		LocalDate paymentDate1 = LocalDate.of(2019, Month.OCTOBER, 23);
//		LocalDate reservationDate2 = LocalDate.of(2019, Month.OCTOBER, 20);
//		LocalDate paymentDate2 = LocalDate.of(2019, Month.OCTOBER, 21);
//		LocalDate reservationDate3 = LocalDate.of(2019, Month.OCTOBER, 21);
//		LocalDate paymentDate3 = LocalDate.of(2019, Month.OCTOBER, 21);
		
//		Passenger pas = new Passenger(17852, "Ahmed", "Ahmed", birthDate, 00421545321, "ahmed@gmail.com", addressPas);
//		Passenger pas1 = new Passenger(12367, "Sahar", "Elaida", birthDate1, 00332526254, "elaida@gmail.com", addressPas1);
//		Passenger pas2 = new Passenger(12325, "Fatima Zahra", "meghni", birthDate2, 00332526236, "meghni@gmail.com", addressPas2);
//		Passenger pas3 = new Passenger(12336, "Zakaria", "Karwan", birthDate3, 00332623252, "karwan@gmail.com", addressPas3);
//		Address addressComp = new Address("Greece", "Spata", "International Airport");
//		Company company = new Company(64534765, "Olympic Air", "Athens International Airport" , addressComp, "800 million");
		Pilot pilot = new Pilot(26783,"Adam" , "Adam", Grade.Pilote_Commandant.name());	
//		Plane plane = new Plane(231, "Bombardier", "Q400", 70,  pilot);
		Pilot pilot1 = new Pilot(74643,"Ferid" , "Ferid", Grade.Pilote_Officier.name());
//		Plane plane1 = new Plane(145, "Airbus", "A321", 200, pilot1);
		
		
//		daoPas.add(pas);
//		daoPas.add(pas1);
//		daoPas.add(pas2);
//		daoPas.add(pas3);
//		daoComp.add(company);
//		daoPlt.add(pilot);
//		daoPlt.add(pilot1);
//		daoPl.add(plane);
//		daoPl.add(plane1);
//		Flight flight = new Flight(754432, departureDate, arrivalDate, departureTime, arrivalTime, "Athens", "Caire", plane, company);
//		Flight flight1 = new Flight(746335, departureDate1, arrivalDate1, departureTime1, arrivalTime1, "Alexandria", "Athens", plane, company);
//		Flight flight2 = new Flight(746400, departureDate2, arrivalDate2, departureTime2, arrivalTime2, "Athens", "Zurich", plane1, company);
//		Flight flight3 = new Flight(747000, departureDate4, arrivalDate4, departureTime4, arrivalTime4, "Athens", "Caire", plane, company);
//		daoFl.add(flight);
//		daoFl.add(flight1);
//		daoFl.add(flight2);
		
//		Ticket ticket = new Ticket(564564321, emmissionDate, reservationDate, paymentDate, pas, flight);
//		Ticket ticket1 = new Ticket(564564375, emmissionDate, reservationDate1, paymentDate1, pas1, flight);
//		Ticket ticket2 = new Ticket(564564325, emmissionDate, reservationDate2, paymentDate2, pas2, flight);
//		Ticket ticket3 = new Ticket(564564336, emmissionDate, reservationDate3, paymentDate3, pas3, flight);
//		daoTck.add(ticket1);
//		daoTck.add(ticket2);
//		daoTck.add(ticket3);
//		Ticket ticket = new Ticket(562550336, emmissionDate4, reservationDate4, paymentDate4, pas, flight1);
//		daoTck.add(ticket);
		
//		daoFl.add(flight3);

		

	}

}
