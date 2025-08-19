package ao.jose.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Table(name="Menu_Items")
@Entity(name="Menu_Items")
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MenuItem {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer menuId;

    @Column(name="name")
    private String name;

    @Column(name="category")
    private String category;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private BigDecimal price;
}
