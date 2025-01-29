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

public class GeneratedInit_DBAppTest2 {

    public DBAppTest() {
    }

    @Test
    public void init_DBAppTest2() throws DBAppException, IOException {
        String[] strmyTables = {"/home/user/my_tables", "/home/user/my_columns"};
        HashSet<String> myTables = new HashSet<>();
        for (String str : strmyTables) {
            Validator.validate(str);
            try (CsvReader reader = new CsvReader(new Serializer())) {
                if (reader.read()) {
                    myTables.add(reader.readLine());
                }
            } catch (IOException e) {
                throw new DbAppException(e.getMessage(), e);
            }
        }

        assertTrue(myTables.contains("/home/user/my_tables"));
    }

}