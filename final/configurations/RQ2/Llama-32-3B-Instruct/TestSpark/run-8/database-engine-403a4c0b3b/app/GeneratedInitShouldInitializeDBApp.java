package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;

import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedInitShouldInitializeDBApp {

    @Test
    public void initShouldInitializeDBApp() throws DBAppException {
        DBApp db = new DBApp();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        try (FileWriter writer = new FileWriter("output.csv")) {
            db.init();
            writer.write(outContent.toString());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

}