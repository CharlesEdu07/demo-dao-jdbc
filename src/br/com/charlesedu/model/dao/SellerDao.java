package br.com.charlesedu.model.dao;

import java.util.List;

import br.com.charlesedu.model.entities.Seller;

public interface SellerDao {
    void insert(Seller obj);

    void update(Seller obj);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<Seller> findAll();
}
