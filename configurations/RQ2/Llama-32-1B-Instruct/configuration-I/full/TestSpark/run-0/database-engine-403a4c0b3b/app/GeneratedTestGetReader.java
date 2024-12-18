package app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestGetReader {

    private DBApp dbApp = new DBApp();

    @Test
    public void testGetReader() {
        dbApp.init();
        String readerClassname = DBAppCsvReader.class.getSimpleName().replaceFirst("(?i)\\(", "").toLowerCase();
        Class<?> csvReaderClass = Class.forName(readerClassname);
        DbAppCsvReader csvReader = (DbAppCsvReader) csvReaderClass.newInstance();
        assertTrue(csvReader instanceof DBAppCsvReader);
    }

}