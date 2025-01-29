package app;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import util.filecontroller.Serializer;
import storage.*;
import util.TypeCaster;
import util.search.*;
import sql.SQLTerm;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import util.validation.Validator;

public class GeneratedTestInsertIntoTable_WhenInitialized_ReturnsCreatedTableObject {

    private HashSet<String> myTables = new HashSet<>();
    private Serializer serializer = new Serializer();
    private Validator validator = new Validator();

    public static class GetMyTablesTest extends AbstractDbAppTest {

        @Test
        public void testInsertIntoTable_WhenInitialized_ReturnsCreatedTableObject() throws DBAppException {
            when(init()).thenReturn(table);
            when(insertIntoTable("table_name", null)).thenReturn(tableValue);
            verify(myTables).add("table");
        }
    }

}