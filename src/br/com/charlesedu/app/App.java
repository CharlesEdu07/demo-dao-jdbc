package br.com.charlesedu.app;
import br.com.charlesedu.model.dao.DaoFactory;
import br.com.charlesedu.model.dao.SellerDao;
import br.com.charlesedu.model.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
