package hibernate.demo;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Instructor;
import hibernate.demo.entity.InstructorDetail;

public class GetInstructorDetailDemo {

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
			
			int theId = 301;
			InstructorDetail instructorDetail = session.get(InstructorDetail.class, theId);
			
			System.out.println("InstructorDetail"  + instructorDetail);
			System.out.println("The associated instructor:"  + instructorDetail.getInstructor());
			
			
			session.getTransaction().commit();
			System.out.println("Done");
		}
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}
	}

}
