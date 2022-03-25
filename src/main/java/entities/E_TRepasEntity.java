package entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "repas", schema = "ctppoo", catalog = "")
public class E_TRepasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "daterepas", nullable = true)
    private Date daterepas;
    @Basic
    @Column(name = "heurerepas", nullable = true)
    private Time heurerepas;
    @Basic
    @Column(name = "typerepas", nullable = true, length = 45)
    private String typerepas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDaterepas() {
        return daterepas;
    }

    public void setDaterepas(Date daterepas) {
        this.daterepas = daterepas;
    }

    public Time getHeurerepas() {
        return heurerepas;
    }

    public void setHeurerepas(Time heurerepas) {
        this.heurerepas = heurerepas;
    }

    public String getTyperepas() {
        return typerepas;
    }

    public void setTyperepas(String typerepas) {
        this.typerepas = typerepas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E_TRepasEntity that = (E_TRepasEntity) o;
        return id == that.id && Objects.equals(daterepas, that.daterepas) && Objects.equals(heurerepas, that.heurerepas) && Objects.equals(typerepas, that.typerepas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, daterepas, heurerepas, typerepas);
    }
}
