package app;

import app.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import com.opencsv.exceptions.CsvValidationException;

public class Generated[MethodUnderTest]

updateTable {

    @Test
    public void [MethodUnderTest]updateTable() throws DBAppException {
        String[] tableNames = {"table1", "table2"};
        HashSet<String> myTables = new HashSet<>();
        for (String tableName : tableNames) {
            myTables.add(tableName);
        }
        CSVReader reader = new CSVReader(myTables);

        String[] columnNames = {"column1", "column2"};
        Object[][] columnValues = new Object[0][0];

        for (String tableName : tableNames) {
            String[] row = reader.read(tableName, columnNames, columnValues);
            for (Object value : row) {
                ((List<String>) columnValues[0]).add(value.toString());
            }
        }

        dbApp.init();
    }

}