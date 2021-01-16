package Models;

import express.database.Model;
import org.dizitart.no2.objects.Id;

@Model
public class Apartment {
    @Id
    private String id;
    private String customer;
    private String sellerId;
    private int sellerCommission = 100;
    private int profit = 400;
    private String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id='" + id + '\'' +
                ", customer='" + customer + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", sellerCommission=" + sellerCommission +
                ", profit=" + profit +
                '}';
    }
}
