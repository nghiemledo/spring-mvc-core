package hibernate.demo;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Course;
import hibernate.demo.entity.Instructor;
import hibernate.demo.entity.InstructorDetail;

public class GetCourseDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Instructor.class)
										.addAnnotatedClass(InstructorDetail.class)
										.addAnnotatedClass(Course.class)
										.buildSessionFactory();

		// Create session
		Session session = factory.getCurrentSession();

		try {
			session.beginTransaction();
			int theId = 1;
			Instructor instructor = session.get(Instructor.class, theId);
			
			System.out.println("Instructor" + instructor);
			System.out.println("Courses" + instructor.getCourses());
			
			session.getTransaction().commit();
			System.out.println("Done");
		} finally {
			factory.close();
		}
	}

}
