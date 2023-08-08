package br.com.charlesedu.app;

import java.util.Date;

import br.com.charlesedu.model.entities.Department;
import br.com.charlesedu.model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

        System.out.println(seller);
    }
}
