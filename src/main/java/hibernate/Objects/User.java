package hibernate.Objects;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private List<Product> products;

    public User() {
    }

    public User(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public User(long id, String name, List<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

//    @Override
//    public String toString() {
//        return String.format("User [id = %d, name = %s, products = %a]", id, name,products);
//    }
//
//    @Override
//    public String toString() {
//        return String.format("User [id = %d, name = %s, products = %a]", id, name,products.size());
//    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Product product : products) {
            sb.append(product.getTitle()+ ",");
        }
        String p = sb.toString();
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", products=" + p +
                '}';
    }
}
