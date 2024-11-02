package hibernate.demo;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Instructor;
import hibernate.demo.entity.InstructorDetail;

public class CreateDemo {

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
			Instructor instructor = new Instructor("F", "Le", "email5");
			InstructorDetail instructorDetail = new InstructorDetail("youtube5", "hobby5");
			
			instructor.setInstructorDetail(instructorDetail);
			session.beginTransaction();
//			
//			@OneToOne(cascade=CascadeType.ALL)
//			@JoinColumn(name="instructor_detail_id")
			session.save(instructor);
			System.out.println("Saving" + instructor.getInstructorDetail());
			
			session.getTransaction().commit();
			System.out.println("Done");
		} finally {
			factory.close();
		}
	}

}
