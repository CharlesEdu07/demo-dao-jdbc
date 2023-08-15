package br.com.charlesedu.app;

import br.com.charlesedu.model.dao.DaoFactory;
import br.com.charlesedu.model.dao.DepartmentDao;

public class App2 {
    public static void main(String[] args) throws Exception {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        System.out.println(departmentDao.findById(1));
    }
}
