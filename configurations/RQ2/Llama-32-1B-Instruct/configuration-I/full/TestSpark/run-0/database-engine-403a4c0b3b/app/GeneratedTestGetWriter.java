package app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestGetWriter {

    private DBApp dbApp = new DBApp();

    @Test
    public void testGetWriter() {
        dbApp.init();
        String writerClassname = DBAppCsvWriter.class.getSimpleName().replaceFirst("(?i)\\(", "").toLowerCase();
        Class<?> csvWriterClass = Class.forName(writerClassname);
        DbAppCsvWriter csvWriter = (DbAppCsvWriter) csvWriterClass.newInstance();
        assertTrue(csvWriter instanceof DbAppCsvWriter);
    }

}