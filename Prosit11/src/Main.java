import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        ProductManagement p1 = new ProductManagement();

        List<Produit> products = new ArrayList<>();
        products.add(new Produit(1, "Clavier", 50));
        products.add(new Produit(2, "Souris", 25));
        products.add(new Produit(3, "Ecran", 400));


        Consumer<Produit> con = p -> System.out.println(p);
        p1.displayProducts(products, con);


        Predicate<Produit> pre = p -> p.getPrixProd() > 100;
        p1.displayProductsByFilter(products, pre, con);


        Function<Produit, String> fun = p -> p.getNomProd();
        String noms = p1.returnProductsNames(products, fun);
        System.out.println(noms);


        Supplier<Produit> sup = () -> new Produit(4, "Casque", 80);
        Produit p4 = p1.createProduct(sup);
        System.out.println(p4);


        Comparator<Produit> com = (a, b) -> a.getIdProd() - b.getIdProd();
        p1.sortProductsById(products, com);

        for (Produit p : products) {
            System.out.println(p);
        }
    }
}



