package controller;

import Library.Book;


import com.fasterxml.jackson.core.JsonProcessingException;
import model.Model;
import view.View;

import java.io.IOException;

public class Controlller {

    public void execute() throws JsonProcessingException, IOException {
        Model model = new Model();
        View view = new View();
        Book book = model.NewBook("kek", "kek2", 2019, 200);
        model.addJsonBook(book);

    }

}
