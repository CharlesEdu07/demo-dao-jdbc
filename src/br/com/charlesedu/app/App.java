package br.com.charlesedu.app;

import br.com.charlesedu.model.entities.Department;

public class App {
    public static void main(String[] args) throws Exception {
        Department obj = new Department(1, "Books");

        System.out.println(obj);
    }
}
