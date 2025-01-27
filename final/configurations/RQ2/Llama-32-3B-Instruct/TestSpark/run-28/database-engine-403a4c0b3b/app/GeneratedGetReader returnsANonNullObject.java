package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GeneratedGetReader returnsANonNullObject {

    @Test
    public void getReader

    returnsANonNullObject() {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

}