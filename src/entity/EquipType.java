package entity;

import javax.persistence.*;

@Entity
@Table(name = "equip_type")
public class EquipType {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String name;

    public EquipType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Equip{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
