package entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "symptome", schema = "ctppoo", catalog = "")
public class E_TSymptomeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id", nullable = false)
    private int id;
    @Basic
    @Column(name = "datesymptome", nullable = true)
    private Date datesymptome;
    @Basic
    @Column(name = "heureSymptome", nullable = true)
    private Time heureSymptome;
    @Basic
    @Column(name = "duree", nullable = true)
    private Integer duree;
    @Basic
    @Column(name = "listesymptomes_id", nullable = false)
    private int listesymptomesId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatesymptome() {
        return datesymptome;
    }

    public void setDatesymptome(Date datesymptome) {
        this.datesymptome = datesymptome;
    }

    public Time getHeureSymptome() {
        return heureSymptome;
    }

    public void setHeureSymptome(Time heureSymptome) {
        this.heureSymptome = heureSymptome;
    }

    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    public int getListesymptomesId() {
        return listesymptomesId;
    }

    public void setListesymptomesId(int listesymptomesId) {
        this.listesymptomesId = listesymptomesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E_TSymptomeEntity that = (E_TSymptomeEntity) o;
        return id == that.id && listesymptomesId == that.listesymptomesId && Objects.equals(datesymptome, that.datesymptome) && Objects.equals(heureSymptome, that.heureSymptome) && Objects.equals(duree, that.duree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, datesymptome, heureSymptome, duree, listesymptomesId);
    }
}
