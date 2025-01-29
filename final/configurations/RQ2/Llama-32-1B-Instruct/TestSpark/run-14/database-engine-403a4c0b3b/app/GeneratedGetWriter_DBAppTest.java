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

public class GeneratedGetWriter_DBAppTest {

    public DBAppTest() {
    }

    @Test
    public void getWriter_DBAppTest() throws DBAppException, IOException {
        String[] strmyTables = {"/home/user/my_tables", "/home/user/my_columns"};
        HashSet<String> myTables = new HashSet<>();
        for (String str : strmyTables) {
            Validator.validate(str);
            try (CsvWriter writer = new CsvWriter(new Serializer())) {
                if (writer.write()) {
                    myTables.add(writer.readLine());
                }
            } catch (IOException e) {
                throw new DbAppException(e.getMessage(), e);
            }
        }

        assertEquals(2, myTables.size());

        String[] strarrOperators = {"/home/user/operator1", "/home/user/operator2"};
        try (CsvWriter writer = new CsvWriter(new Serializer())) {
            if (!writer.write()) {
                throw new DbAppException("Failed to write to database");
            }
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("already exists"));
        }

        try (CsvWriter writer = new CsvWriter(new Serializer())) {
            String[] strarrOperators = {"/home/user/operator1", "/home/user/operator2"};
            assertFalse(writer.write());
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("already exists"));
        }
    }

}