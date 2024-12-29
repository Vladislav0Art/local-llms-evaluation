package app;

import app.exceptions.DBAppException;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException_;
import exceptions.IdDatabaseException_;
import exceptions.IdNotFoundException_;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedUpdateTable_ReturnsVoid {

    private String dbName = "my_database";
    private String dbPassword = "my_password";

    @BeforeEach
    public void setUp() {
        // Initialize the test database using the mockDB function provided in util.filecontroller.Serializer
        Serializer serializer = new Serializer();
        serializer.mockDB(dbName, dbPassword);
    }

    @Test
    public void updateTable_ReturnsVoid() {
        DBAppImpl dbApp = new DBAppImpl();
        // No exception should be thrown
        Mockito.verifyNoException();
    }

}