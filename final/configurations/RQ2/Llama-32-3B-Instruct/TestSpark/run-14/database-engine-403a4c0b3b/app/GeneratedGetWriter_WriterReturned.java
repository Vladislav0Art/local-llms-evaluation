package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.ArrayList;
import java.io.IOException;

public class GeneratedGetWriter_WriterReturned {

    private DBApp dbApp = new DBApp();

    @Test
    public void getWriter_WriterReturned() throws IOException, CsvValidationException {
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

}