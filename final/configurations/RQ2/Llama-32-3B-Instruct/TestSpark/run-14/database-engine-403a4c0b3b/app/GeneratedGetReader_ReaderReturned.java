package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.ArrayList;
import java.io.IOException;

public class GeneratedGetReader_ReaderReturned {

    private DBApp dbApp = new DBApp();

    @Test
    public void getReader_ReaderReturned() throws IOException, CsvValidationException {
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

}