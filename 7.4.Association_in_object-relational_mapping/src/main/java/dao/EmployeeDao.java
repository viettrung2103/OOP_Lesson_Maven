package dao;

import datasource.MariaDbJPAConnection;
import entity.*;
import jakarta.persistence.EntityManager;

import java.util.List;

public class EmployeeDao {

    public void persist(Employee emp) {
        EntityManager em = MariaDbJPAConnection.getInstance();
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
    }

    // using detach
    // jpa have this query
    // select e1_0.id,d1_0.id,d1_0.name,e1_0.email,e1_0.first_name,e1_0.last_name,e1_0.salary from employee e1_0 left join Department d1_0 on d1_0.id=e1_0.department_id where e1_0.id=?
    public Employee find(int id) {
        EntityManager em = MariaDbJPAConnection.getInstance();
        Employee emp = em.find(Employee.class, id);
        return emp;
    }

    public List<Employee> findAll() {
        EntityManager em = MariaDbJPAConnection.getInstance();
        List<Employee> emps = em.createQuery("select e from Employee e").getResultList();
        return emps;
    }

    public void update(Employee emp) {
        EntityManager em = MariaDbJPAConnection.getInstance();
        em.getTransaction().begin();
        em.merge(emp);
        em.getTransaction().commit();
    }

    public void delete(Employee emp) {
        EntityManager em = MariaDbJPAConnection.getInstance();
        em.getTransaction().begin();
        em.remove(emp);
        em.getTransaction().commit();
    }

    //using detach, we force em to retrieve from database, not from inside em
    public void detach(Employee emp) {
        EntityManager em = MariaDbJPAConnection.getInstance();
        em.detach(emp);
    }

    // Clear the EntityManager to detach all entities
    public void clear() {
        EntityManager em = MariaDbJPAConnection.getInstance();
        em.clear();
    }
}
