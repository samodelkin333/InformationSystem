package model;

import Library.Book;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;

public class Model{


    public Book NewBook(String author, String title, int year, int countPages){
        return new Book(author,title,year,countPages);
    }

    public String addJsonBook(Book book) throws JsonProcessingException, IOException {
        Book[] books = new Book[]{book,book};
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter writer = objectMapper.writer(new DefaultPrettyPrinter());
        String result = objectMapper.writeValueAsString(book);
        File file = new File("./test.json");
        writer.writeValue(file,book);
        writer.writeValue(file,book);

        return result;
    }
}
