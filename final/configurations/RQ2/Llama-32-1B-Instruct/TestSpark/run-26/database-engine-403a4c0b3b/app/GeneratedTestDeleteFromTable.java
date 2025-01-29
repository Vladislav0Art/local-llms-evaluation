package app;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import exception.UtilException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedTestDeleteFromTable {

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
        public void testDeleteFromTable() throws IOException, DBAppException {
            Validator validator = new Validator();
            Hashtable<String, Object> htblColNameValue = new Hashtable<>();
            createTable("testTable", validator, null, null, null);
            insertIntoTable("testTable", htblColNameValue);

            deleteFromTable("testTable", htblColNameValue);

            List<CSVReaderEntry> csvReadersEntries = selectFromTable(new String[]{"column1", "operator"}, new String[]{"value"});
            assert csvReadersEntries.isEmpty();
        }
    }

}