package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "lend")
public class Lend {
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private Date dateTaken;

    @Column(nullable = true)
    private Date dateReturned;

    @Column(nullable = false)
    private String travel;

    @OneToOne(optional = false)
    @JoinColumn(name="equip_id", unique = true, nullable = false)
    private Equip equip;

    @OneToOne(optional = false)
    @JoinColumn(name="user_id", unique = true, nullable = false)
    private User user;

    public Lend() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Equip{" +
                "id=" + id +
                ", dateTaken='" + dateTaken + '\'' +
                ", dateReturned='" + dateReturned + '\'' +
                '}';
    }

    public Date getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    public Date getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }

    public String getTravel() {
        return travel;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public Equip getEquip() {
        return equip;
    }

    public void setEquip(Equip equip) {
        this.equip = equip;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
