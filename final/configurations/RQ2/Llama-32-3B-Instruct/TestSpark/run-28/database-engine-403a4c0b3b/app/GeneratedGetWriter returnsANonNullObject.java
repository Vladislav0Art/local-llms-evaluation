package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GeneratedGetWriter returnsANonNullObject {

    @Test
    public void getWriter

    returnsANonNullObject() {
        DBApp dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

}