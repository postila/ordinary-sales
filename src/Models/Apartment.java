package Models;

import express.database.Model;
import org.dizitart.no2.objects.Id;

@Model
public class Apartment {
    @Id
    private String id;
    private int sellerCommission = 100;
    private int profit = 400;

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
        return "Apartment{" +
                "id='" + id + '\'' +
                ", sellerCommission=" + sellerCommission +
                ", profit=" + profit +
                '}';
    }
}
