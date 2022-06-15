
package co.unicauca.products.access;

import co.unicauca.products.domain.entity.Product;
import java.util.List;

/**
 * Interfaz de los servicios del respositorio 
 * @author mfcaicedo
 */
public interface IProductRepository {
    List<Product> findAll();
    Product findById(Integer id);
    boolean create(Product product);
    boolean update(Product product);
    boolean delete(Integer id);
}
