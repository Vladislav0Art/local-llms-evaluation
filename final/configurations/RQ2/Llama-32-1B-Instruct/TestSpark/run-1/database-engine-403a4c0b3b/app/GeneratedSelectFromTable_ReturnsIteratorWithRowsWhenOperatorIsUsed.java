package app;

import app.exceptions.DBAppException;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException_;
import exceptions.IdDatabaseException_;
import exceptions.IdNotFoundException_;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedSelectFromTable_ReturnsIteratorWithRowsWhenOperatorIsUsed {

    private String dbName = "my_database";
    private String dbPassword = "my_password";

    @BeforeEach
    public void setUp() {
        // Initialize the test database using the mockDB function provided in util.filecontroller.Serializer
        Serializer serializer = new Serializer();
        serializer.mockDB(dbName, dbPassword);
    }

    @Test
    public void selectFromTable_ReturnsIteratorWithRowsWhenOperatorIsUsed() {
        DBAppImpl dbApp = new DBAppImpl();
        // Test the method with a valid SQL term and an operator
        Iterator<Row> rows = dbApp.selectFromTable(new String[]{"SELECT * FROM my_table WHERE id=1"}, new String[]{"id"});
        assertNotNull(rows);
        Mockito.verify(reader).getTableName();
    }

}