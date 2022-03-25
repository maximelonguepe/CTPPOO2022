package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "listeconsommation", schema = "ctppoo", catalog = "")
@IdClass(E_TListeconsommationEntityPK.class)
public class E_TListeconsommationEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "repas_id", nullable = false)
    private int repasId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "aliments_id", nullable = false)
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
        E_TListeconsommationEntity that = (E_TListeconsommationEntity) o;
        return id == that.id && repasId == that.repasId && alimentsId == that.alimentsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, repasId, alimentsId);
    }
}
