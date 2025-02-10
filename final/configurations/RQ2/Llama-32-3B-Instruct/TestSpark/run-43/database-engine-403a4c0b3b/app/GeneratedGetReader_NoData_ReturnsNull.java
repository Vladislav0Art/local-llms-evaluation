package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetReader_NoData_ReturnsNull {

    @Test
    public void getReader_NoData_ReturnsNull() {
        DBApp dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNull(reader);
    }

}