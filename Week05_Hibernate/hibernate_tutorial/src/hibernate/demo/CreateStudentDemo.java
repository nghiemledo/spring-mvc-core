package hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();

		// Create session
		Session session = factory.getCurrentSession();

		try {
			// use the session object to save Java object
			System.out.println("Create new student object");
			// create a student object
			Student tempStudent = new Student("A123", "Nghiem", "a@b.com");
			// start a transaction
			session.beginTransaction();
			// save the student object
			System.out.println("Saving..");
			session.save(tempStudent);
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
		} finally {
			factory.close();
		}
	}

}
