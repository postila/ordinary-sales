package com.company;

import express.Express;

import static express.database.Database.collection;

public class Main {

    public static void main(String[] args) {

        Express app = new Express();
        app.enableCollections();

        app.get("/rest/users", (req, res) -> {
           var users = collection("User").find();

           res.json(users);
        });

        app.get("/rest/user/:id", (req, res) -> {
            var id = req.params("id");
            var user = collection("User").findById(id);

            if (user != null){
                res.json(user);
            }
            else {
                res.send("User not found");
            }
        });

        app.get("/rest/sellers", (req, res) -> {
            var sellers = collection("Seller").find();

            res.json(sellers);
        });

        app.get("/rest/seller/:id",(req, res) -> {
            var id = req.params("id");
            var seller = collection("Seller").findById(id);

           res.json(seller);
        });

        app.get("/rest/sales", (req, res) -> {
            var sales = collection("Sale").find();

            res.json(sales);
        });

        app.get("/rest/sales/:id", (req, res) -> {
            var id = req.params("id");
            var sale = collection("Sale").findById(id);

            if(sale != null) {
                res.json(sale);
            }
            else {
                res.send("Sale not found");
            }
        });

        app.listen(5000);
    }
}
