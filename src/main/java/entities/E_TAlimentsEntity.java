package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "aliments", schema = "ctppoo", catalog = "")
public class E_TAlimentsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "Description", nullable = true, length = 45)
    private String description;

    public E_TAlimentsEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E_TAlimentsEntity that = (E_TAlimentsEntity) o;
        return id == that.id && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }

    public E_TAlimentsEntity(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "E_TAlimentsEntity{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
