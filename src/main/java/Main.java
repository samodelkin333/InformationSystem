import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import controller.Controlller;

import java.io.IOException;

public class Main {
    public static void main(String[] arg) throws JsonProcessingException, IOException   {
        Controlller controlller = new Controlller();
        controlller.execute();
    }
}
