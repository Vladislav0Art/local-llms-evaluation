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

public class GeneratedGetReaderShouldReturnCsvReaderObject {

    @Test
    public void getReaderShouldReturnCsvReaderObject() throws IOException {
        DBApp db = new DBApp();
        CsvReader reader = Mockito.mock(CsvReader.class);
        assertNotNull(db.getReader());
        verify(reader).openFile(Mockito.anyString());
    }

}