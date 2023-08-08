package br.com.charlesedu.model.dao;

import java.util.List;

import br.com.charlesedu.model.entities.Department;

public interface DepartmentDao {
    void insert(Department obj);

    void update(Department obj);

    void deleteById(Integer id);

    Department findById(Integer id);

    List<Department> findAll();
}
