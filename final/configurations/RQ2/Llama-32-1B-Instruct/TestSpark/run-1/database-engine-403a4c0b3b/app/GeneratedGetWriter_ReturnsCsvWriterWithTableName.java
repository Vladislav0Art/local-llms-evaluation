package app;

import app.exceptions.DBAppException;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException_;
import exceptions.IdDatabaseException_;
import exceptions.IdNotFoundException_;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedGetWriter_ReturnsCsvWriterWithTableName {

    private String dbName = "my_database";
    private String dbPassword = "my_password";

    @BeforeEach
    public void setUp() {
        // Initialize the test database using the mockDB function provided in util.filecontroller.Serializer
        Serializer serializer = new Serializer();
        serializer.mockDB(dbName, dbPassword);
    }

    @Test
    public void getWriter_ReturnsCsvWriterWithTableName() {
        DBAppImpl dbApp = new DBAppImpl();
        CSVWriter writer = dbApp.getWriter();
        assertNotNull(writer);
        assertEquals("my_database", writer.getTableName());
        Mockito.verify(writer).getTableName();
    }

}