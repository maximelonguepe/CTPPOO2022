package entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class E_TListeconsommationEntityPK implements Serializable {
    @Column(name = "id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "repas_id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int repasId;
    @Column(name = "aliments_id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int alimentsId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRepasId() {
        return repasId;
    }

    public void setRepasId(int repasId) {
        this.repasId = repasId;
    }

    public int getAlimentsId() {
        return alimentsId;
    }

    public void setAlimentsId(int alimentsId) {
        this.alimentsId = alimentsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E_TListeconsommationEntityPK that = (E_TListeconsommationEntityPK) o;
        return id == that.id && repasId == that.repasId && alimentsId == that.alimentsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, repasId, alimentsId);
    }
}
