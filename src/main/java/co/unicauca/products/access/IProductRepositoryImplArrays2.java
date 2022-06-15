package co.unicauca.products.access;

import co.unicauca.products.domain.entity.Product;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Alternative;

/**
 *Implementación del repositorio alternativa. Se puede cambiar las annotaciones
 * @Default y @Alternative al gusto.
 * @author mfcaicedo 
 */
@RequestScoped
@Alternative
public class IProductRepositoryImplArrays2 implements IProductRepository {

    public static List<Product> products;
    public IProductRepositoryImplArrays2() {
        if (products == null){
            products = new ArrayList<>();
            initialize();
        }
    }
    private void initialize() {
        products.add(new Product(1, "Cama duplex", 300000d));
        products.add(new Product(2, "Sofa cama", 300000d));
        products.add(new Product(1, "Nochero", 400000d));
    }

    
    
    
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(Integer id) {
        for (Product prod : products) {
        if (prod.getId() == id) {
            return prod;
            }
        }
        return null;
    }

    @Override
    public boolean create(Product product) {
        Product prod =  this.findById(product.getId());
        if (prod != null) {
        //Ya existe
            return false;
        }
        products.add(product);
        return true;
    }

    @Override
    public boolean update(Product product) {
        Product prod = this.findById(product.getId());
        if (prod != null) {
            prod.setName(product.getName());
            prod.setPrice(product.getPrice());
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        int i = 0;
        for (Product prod : products) {
            if (prod.getId() == id) {
                products.remove(i++);
                return true;
            }
        }
        return false;
    }
    
}
