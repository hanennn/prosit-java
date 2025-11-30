import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ProductManagement implements Management {

    @Override
    public void displayProducts(List<Produit> products, Consumer<Produit> con){
        for(Produit p : products){
            con.accept(p);
        }
    }

    @Override
    public void displayProductsByFilter(List<Produit> products, Predicate<Produit> pre, Consumer<Produit>con){
        for(Produit p : products){
            if(pre.test(p)){
                con.accept(p);
            }
        }
    }


    public String returnProductsNames(List<Produit> products, Function<Produit, String> fun){
        String result = "";
        for (Produit p : products) {
            result += fun.apply(p);
        }
        return result;

    }
    public Produit createProduct(Supplier<Produit> sup){
        return sup.get();
    }
    public List<Produit> sortProductsById(List<Produit> products, Comparator<Produit> com){
        products.sort(com);
        return products;

    }

    @Override
    public Stream<Produit> convertToStream(List<Produit> products) {
       return 0;
    }


}
