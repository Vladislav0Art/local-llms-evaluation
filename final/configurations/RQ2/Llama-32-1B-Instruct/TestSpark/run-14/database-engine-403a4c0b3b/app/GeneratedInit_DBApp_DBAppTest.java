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

public class GeneratedInit_DBApp_DBAppTest {

    public DBApp getDBApp() {
        return new DBApp();
    }

    @Test
    public void init_DBApp_DBAppTest() throws DbAppException, IOException {
        DBApp dbApp = (DBApp) this.getDBApp();

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

        String[] strarrOperators = {"/home/user/operator1", "/home/user/operator2"};
        Iterator<SQLTerm> iterator = dbApp.getReader().selectFromTable(strarrOperators);

        assertTrue(iterator.hasNext());
        assertEquals("SELECT * FROM table_name WHERE column_name IN ( 'value1', 'value2' )", iterator.next().toString());

        iterator.remove();
    }

}