package br.com.charlesedu.model.dao;

import br.com.charlesedu.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
