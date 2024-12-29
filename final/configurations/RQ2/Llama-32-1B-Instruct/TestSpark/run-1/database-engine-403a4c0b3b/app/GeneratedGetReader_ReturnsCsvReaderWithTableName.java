package app;

import app.exceptions.DBAppException;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException_;
import exceptions.IdDatabaseException_;
import exceptions.IdNotFoundException_;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedGetReader_ReturnsCsvReaderWithTableName {

    private String dbName = "my_database";
    private String dbPassword = "my_password";

    @BeforeEach
    public void setUp() {
        // Initialize the test database using the mockDB function provided in util.filecontroller.Serializer
        Serializer serializer = new Serializer();
        serializer.mockDB(dbName, dbPassword);
    }

    @Test
    public void getReader_ReturnsCsvReaderWithTableName() {
        DBAppImpl dbApp = new DBAppImpl();
        CSVReader reader = dbApp.getReader();
        assertNotNull(reader);
        assertEquals("my_database", reader.getTableName());
        Mockito.verify(reader).getTableName();
    }

}