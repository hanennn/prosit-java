import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface Management {
    public void displayProducts(List<Produit> products, Consumer<Produit> con);
    public void displayProductsByFilter(List<Produit> products, Predicate<Produit> pre, Consumer<Produit>con);
    public String returnProductsNames(List<Produit> products, Function<Produit, String> fun);
    public Produit createProduct(Supplier<Produit> sup);
    public List<Produit> sortProductsById(List<Produit> products, Comparator<Produit> com);
    public Stream<Produit> convertToStream(List<Produit> products);
}