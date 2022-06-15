package co.unicauca.products.domain.entity;

/**
 * Representa un producto en la tienda 
 * @author mfcaicedo
 */
public class Product {
    /**
     * Atributos
     */
    private Integer id; 
    private String name;
    private Double price;
    /**
     * Constructor 
     */
    public Product(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Product() {
    }
    /**
    * Getters and setters
    */
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price +'}';
    }
}
