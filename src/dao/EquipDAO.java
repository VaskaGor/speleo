package dao;

import entity.Equip;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class EquipDAO {
    @PersistenceContext(unitName = "SpeleoAdminDS")
    private EntityManager em;

    public void save(Equip equip) {
        em.persist(equip);
    }

    public List<Equip> findAll() {
        return em.createQuery("SELECT e FROM Equip e")
                .getResultList();
    }
}
