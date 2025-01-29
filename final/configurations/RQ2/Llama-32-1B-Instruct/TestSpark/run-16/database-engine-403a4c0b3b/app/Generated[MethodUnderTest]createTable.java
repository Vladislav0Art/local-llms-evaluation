package app;

import app.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import com.opencsv.exceptions.CsvValidationException;

public class Generated[MethodUnderTest]

createTable {

    @Test
    public void [MethodUnderTest]createTable() throws DBAppException {
        String[] tableNames = {"table1", "table2"};
        HashSet<String> myTables = new HashSet<>();
        for (String tableName : tableNames) {
            myTables.add(tableName);
        }
        CSVReader reader = new CSVReader(myTables);
        CSVWriter writer = new CSVWriter();
        String[] columnNames = {"column1", "column2"};
        String[] columnValues = {"value1", "value2"};

        for (String tableName : tableNames) {
            String[] row = reader.read(tableName, columnNames, columnValues);
            for (String value : row) {
                writer.write(row, tableName, columnNames, columnValues);
            }
        }

        dbApp.init();
    }

}