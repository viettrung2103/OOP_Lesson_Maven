package dao;

import datasource.MariaDbJPAConnection;
import entity.Department;
import jakarta.persistence.EntityManager;

public class DepartmentDao {

    public void persist(Department dept) {
        EntityManager em = MariaDbJPAConnection.getInstance();
        em.getTransaction().begin();
        em.persist(dept);
        em.getTransaction().commit();
    }

    public Department find(int id) {
        EntityManager em = MariaDbJPAConnection.getInstance();
        Department dept = em.find(Department.class, id);
        return dept;
    }

    public void clear() {
        EntityManager em = MariaDbJPAConnection.getInstance();
        em.clear();
    }


}
