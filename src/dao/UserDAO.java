package dao;

import entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UserDAO {
    @PersistenceContext(unitName = "SpeleoAdminDS")
    private EntityManager em;

    public void save(User user){
        em.persist(user);
    }

    public List<User> findAll(){
        return em.createQuery("select u from User u")
                .getResultList();
    }
}