package app;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import exception.UtilException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedTestGetReader {

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
        public void testGetReader() throws IOException, CsvValidationException {
            Validator validator = new Validator();
            CSVReader csvReader = getReader(validator);
            List<CSVReaderEntry> entries = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                entries.add(new CSVReaderEntry("value", "operator"));
            }
            csvReader.setEntries(entries);

            assert csvReader.getHeaders().size() == 2;
        }

    }