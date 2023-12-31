package br.com.charlesedu.model.dao;

import br.com.charlesedu.db.DB;
import br.com.charlesedu.model.dao.impl.DepartmentDaoJDBC;
import br.com.charlesedu.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao() {
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
