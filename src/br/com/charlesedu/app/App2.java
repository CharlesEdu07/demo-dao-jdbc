package br.com.charlesedu.app;

import java.util.List;
import java.util.Scanner;

import br.com.charlesedu.model.dao.DaoFactory;
import br.com.charlesedu.model.dao.DepartmentDao;
import br.com.charlesedu.model.entities.Department;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department dep = departmentDao.findById(1);

        System.out.println(dep);

        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department> deps = departmentDao.findAll();

        for (Object obj : deps) {
            System.out.println(obj);
        }

        // System.out.println("\n=== TEST 3: department insert ===");

        // Department newDep = new Department(null, "Music");

        // departmentDao.insert(newDep);

        // System.out.println("Inserted! New id = " + newDep.getId());

        System.out.println("\n=== TEST 4: department update ===");

        dep = departmentDao.findById(1);

        dep.setName("Food");

        departmentDao.update(dep);

        System.out.println("Update completed");

        System.out.println("\n=== TEST 5: department delete ===");

        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();

        departmentDao.deleteById(id);

        System.out.println("Delete completed");

        sc.close();
    }
}
