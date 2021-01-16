package Models;

import express.database.Model;
import org.dizitart.no2.objects.Id;

@Model
public class Business {
    @Id
    private String id;
    private String companyName;
    private int kwh;
    private String sellerId;
    private int sellerCommission = 400;
    private int kwhSellerCommission;
    private int profit = 1000;
    private int kwhProfit;
    private String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
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

    public int getKwhSellerCommission() {
        return kwhSellerCommission;
    }

    public void setKwhSellerCommission(int kwhSellerCommission) {
        this.kwhSellerCommission = kwhSellerCommission;
    }

    public int getProfit() {
        return profit;
    }

    public int getKwhProfit() {
        return kwhProfit;
    }

    public void setKwhProfit(int kwhProfit) {
        this.kwhProfit = kwhProfit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Business{" +
                "id='" + id + '\'' +
                ", companyName='" + companyName + '\'' +
                ", kwh=" + kwh +
                ", sellerId='" + sellerId + '\'' +
                ", sellerCommission=" + sellerCommission +
                ", kwhSellerCommission=" + kwhSellerCommission +
                ", profit=" + profit +
                ", kwhProfit=" + kwhProfit +
                ", date='" + date + '\'' +
                '}';
    }
}
