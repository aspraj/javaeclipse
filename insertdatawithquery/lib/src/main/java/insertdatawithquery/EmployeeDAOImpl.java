

package insertdatawithquery;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpawithgradle");
	EntityManager em = emf.createEntityManager();

	public List<Employee> getAllEmployee() {
		Query query = em.createQuery("SELECT emp from Employee emp");
		List<Employee> list = query.getResultList();
		return list;
	}

	public Employee getEmployeeByName(String empName) {
	Query query = em.createNamedQuery("Employee.findByName");
	query.setParameter("empName", empName);
		return null;
	}
}
