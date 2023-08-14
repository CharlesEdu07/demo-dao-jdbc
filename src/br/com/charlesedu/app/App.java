package br.com.charlesedu.app;
import java.util.List;

import br.com.charlesedu.model.dao.DaoFactory;
import br.com.charlesedu.model.dao.SellerDao;
import br.com.charlesedu.model.entities.Department;
import br.com.charlesedu.model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
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
    }
}
