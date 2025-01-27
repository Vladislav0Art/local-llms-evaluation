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

public class GeneratedGetWriterShouldReturnCsvWriterObject {

    @Test
    public void getWriterShouldReturnCsvWriterObject() throws IOException {
        DBApp db = new DBApp();
        CsvWriter writer = Mockito.mock(CsvWriter.class);
        assertNotNull(db.getWriter());
        verify(writer).openFile(Mockito.anyString());
    }

}