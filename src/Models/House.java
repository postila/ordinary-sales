package Models;

import express.database.Model;
import org.dizitart.no2.objects.Id;

@Model
public class House {
    @Id
    private String id;
    private int sellerCommission = 150;
    private int profit = 1000;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSellerCommission() {
        return sellerCommission;
    }

    public void setSellerCommission(int sellerCommission) {
        this.sellerCommission = sellerCommission;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "House{" +
                "id='" + id + '\'' +
                ", sellerCommission=" + sellerCommission +
                ", profit=" + profit +
                '}';
    }
}
