package app;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import exception.UtilException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedTestCreateTable {

    public static class SQLTerm {
        private String column;
        private String operator;

        public SQLTerm(String column, String operator) {
            this.column = column;
            this.operator = operator;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SQLTerm that = (SQLTerm) o;
            return column.equals(that.column) && operator.equals(that.operator);
        }
    }

    private class ValidatorTest extends DBAppTest {

        @Test
        public void testCreateTable() throws IOException, DBAppException {
            Validator validator = new Validator();
            String tableName = "testTable";
            Hashtable<String, String> htblColNameType = new Hashtable<>();
            htblColNameType.put("column1", "type1");
            Hashtable<String, String> htblColNameMin = new Hashtable<>();
            htblColNameMin.put("column2", "min1");
            Hashtable<String, String> htblColNameMax = new Hashtable<>();

            createTable(tableName, validator, htblColNameType, htblColNameMin, htblColNameMax);
        }

    }