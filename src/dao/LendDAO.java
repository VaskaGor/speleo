package dao;

import entity.Equip;
import entity.Lend;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class LendDAO {
    @PersistenceContext(unitName = "SpeleoAdminDS")
    private EntityManager em;

    public void save(Lend lend) {
        em.persist(lend);
    }

    public List<Lend> findAll() {
        return em.createQuery("SELECT l FROM Lend l")
                .getResultList();
    }
}
