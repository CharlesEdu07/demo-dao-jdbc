package br.com.charlesedu.app;

import java.util.List;
import java.util.Scanner;

import br.com.charlesedu.model.dao.DaoFactory;
import br.com.charlesedu.model.dao.SellerDao;
import br.com.charlesedu.model.entities.Department;
import br.com.charlesedu.model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");

        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: seller findAll ===");

        list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }

        // System.out.println("\n=== TEST 4: seller insert ===");

        // Seller newSeller = new Seller(null, "Reylison", "reyli@gmail.com", new java.util.Date(), 4000.0,
        //         new Department(3, null));

        // sellerDao.insert(newSeller);

        // System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== TEST 5: seller update ===");

        seller = sellerDao.findById(1);

        seller.setName("Martha Waine");
        seller.setEmail("martha@gmail.com");
        
        sellerDao.update(seller);

        System.out.println("Update completed");

        System.out.println("\n=== TEST 6: seller delete ===");

        System.out.print("\nEnter id for delete test: ");
        int id = sc.nextInt();

        sellerDao.deleteById(id);

        System.out.println("Delete completed");
        
        sc.close();
    }
}
