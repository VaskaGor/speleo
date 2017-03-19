package dao;

import entity.Equip;
import entity.EquipType;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class EquipTypeDAO {
    @PersistenceContext(unitName = "SpeleoAdminDS")
    private EntityManager em;

    public void save(EquipType equipType) {
        em.persist(equipType);
    }

    public List<EquipType> findAll() {
        return em.createQuery("SELECT et FROM EquipType et")
                .getResultList();
    }
}
