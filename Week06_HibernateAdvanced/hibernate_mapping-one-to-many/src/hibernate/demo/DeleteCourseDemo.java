package hibernate.demo;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Instructor;
import hibernate.demo.entity.InstructorDetail;
import hibernate.demo.entity.Course;

public class DeleteCourseDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Instructor.class)
										.addAnnotatedClass(Course.class)
										.addAnnotatedClass(InstructorDetail.class)
										.buildSessionFactory();

		// Create session
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			
			Course course = session.get(Course.class, 10);
			
			// Check if exist in database
			System.out.println("Found course: " +  course);
			if(course != null) {
				System.out.println("Deleting: " + course);				
				session.delete(course);
			}
			session.getTransaction().commit();
			System.out.println("Done");
		} finally {
			factory.close();
		}
	}

}
