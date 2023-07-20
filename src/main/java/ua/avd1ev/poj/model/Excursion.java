package ua.avd1ev.poj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "excursion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Excursion extends AbstractBaseEntity {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public String toString() {
        return "Excursion{" +
                "id=" + id +
                ", user=" + user +
                '}';
    }
}
