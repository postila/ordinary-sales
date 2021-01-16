package Models;

import express.database.Model;
import org.dizitart.no2.objects.Id;

@Model
public class Sale {
    @Id
    private String id;
    private String costumer;
    private int date;
    private String userId;
    private String productId;
    private int kwh;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCostumer() {
        return costumer;
    }

    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id='" + id + '\'' +
                ", costumer='" + costumer + '\'' +
                ", date=" + date +
                ", userId='" + userId + '\'' +
                ", productId='" + productId + '\'' +
                ", kwh=" + kwh +
                '}';
    }
}
