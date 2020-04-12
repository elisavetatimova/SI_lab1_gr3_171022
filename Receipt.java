import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public double totalAmount() {
        return this.items.stream().mapToDouble(item -> item.price).sum();
    }

    public double totalTaxReturn() {
        return this.items.stream().mapToDouble(Item::getTaxReturn).sum();
    }
}