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

public class GeneratedGetMyTables_DBAppTest2 {

    public DBAppTest() {
    }

    @Test
    public void getMyTables_DBAppTest2() throws DBAppException {
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

        assertEquals(2, myTables.size());
    }

}