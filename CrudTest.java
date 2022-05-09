import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CrudTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Trying to read persistence.xml file...");
		
		//3
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em = emf.createEntityManager();
		System.out.println("EntityManager created....");
		
		EntityTransaction et = em.getTransaction();
		System.out.println("EntityTransaction created....");
		
		System.out.println("Trying to create record.....");
		
		//insert a record.
		Flight theFlight= new Flight();
//		theFlight.setFlightNumber(103);
//		theFlight.setFlightName("Indigo");
//		theFlight.setFlightSource("Delhi");
//		theFlight.setFlightDestination("Bangalore");
//		theFlight.setFlightTicketcost(7000);
//		theFlight.setNoofPassengers(100);
//		theFlight.setFlightDepartureFromSource(LocalDateTime.now());
//		theFlight.setFlightArrivalAtDestination(LocalDateTime.now());
//		
//		et.begin();
//			em.persist(theFlight);
//		et.commit();
		System.out.println("=================");
		et.begin();
		
		//update a record 
//				Flight f = em.find(Flight.class, 105);
////			f.setFlightDestination("USA");
////			System.out.println(f.getFlightName());
		//		em.merge(f);
		//Delete a record
		//Flight f = em.find(Flight.class, 105);
//			em.remove(f);
//			
//		//Retrieve a record
		Query q= em.createNativeQuery("SELECT * FROM Flight_Info",Flight.class);
		List<Flight> flight1=(List<Flight>)q.getResultList();
		System.out.println("Crrated...");
		for (Flight list : flight1) {
			System.out.println(list.getFlightName());
			System.out.println(list.getFlightNumber());
			System.out.println("============================");
			
			
		}
		
		
//			
//		et.commit();
//			
		
		
		
		System.out.println("Created the record.....");
		
	}

}