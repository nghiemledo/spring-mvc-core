package hibernate.demo;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Instructor;
import hibernate.demo.entity.InstructorDetail;

public class DeleteDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Instructor.class)
										.addAnnotatedClass(InstructorDetail.class)
										.buildSessionFactory();

		// Create session
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			
			Instructor instructor = session.get(Instructor.class, 3);
			
			// Check if exist in database
			System.out.println("Found instructor: " +  instructor);
			if(instructor != null) {
				System.out.println("Deleting: " + instructor);				
				session.delete(instructor);
			}
			session.getTransaction().commit();
			System.out.println("Done");
		} finally {
			factory.close();
		}
	}

}
