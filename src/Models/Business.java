package Models;

import express.database.Model;
import org.dizitart.no2.objects.Id;

@Model
public class Business {
    @Id
    private String id;
    private int kwh;
    private int sellerCommission = 400;
    private int kwhSellerCommission;
    private int profit = 1000;
    private int kwhProfit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public int getSellerCommission() {
        return sellerCommission;
    }

    public void setSellerCommission(int sellerCommission) {
        this.sellerCommission = sellerCommission;
    }

    public int getKwhSellerCommission() {
        return kwhSellerCommission;
    }

    public void setKwhSellerCommission(int kwhSellerCommission) {
        this.kwhSellerCommission = kwhSellerCommission;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public int getKwhProfit() {
        return kwhProfit;
    }

    public void setKwhProfit(int kwhProfit) {
        this.kwhProfit = kwhProfit;
    }

    @Override
    public String toString() {
        return "Business{" +
                "id='" + id + '\'' +
                ", kwh=" + kwh +
                ", sellerCommission=" + sellerCommission +
                ", kwhSellerCommission=" + kwhSellerCommission +
                ", profit=" + profit +
                ", kwhProfit=" + kwhProfit +
                '}';
    }
}
