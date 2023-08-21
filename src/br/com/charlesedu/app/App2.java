package br.com.charlesedu.app;

import java.util.List;

import br.com.charlesedu.model.dao.DaoFactory;
import br.com.charlesedu.model.dao.DepartmentDao;
import br.com.charlesedu.model.entities.Department;

public class App2 {
    public static void main(String[] args) throws Exception {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department dep = departmentDao.findById(1);

        System.out.println(dep);

        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department> deps = departmentDao.findAll();

        for (Object obj : deps) {
            System.out.println(obj);
        }
    }
}
