package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    private DBApp dbApp = new DBApp();

    @BeforeEach
    public void setup() {
        dbApp.init();
    }

    @Test
    public void testGetMyTables() {
        HashSet<String> tables = dbApp.getMyTables();
        assertTrue(tables.contains("Table1"));
        assertTrue(tables.contains("Table2"));
        assertFalse(tables.contains("Table3")); // assuming Table3 is not a table
    }

    @Test
    public void testGetReader() throws DBAppException {
        CSVReader reader = dbApp.getReader();
        assert !(reader instanceof CSVReader);
    }

    @Test
    public void testGetWriter() throws DBAppException {
        CSVWriter writer = dbApp.getWriter();
        assert !(writer instanceof CSVWriter);
    }

    @Test
    public void testInit() {
        dbApp.init();
    }

    @Test
    public void testCreateTable() {
        dbApp.createTable("Table1", "Column1", new Hashtable<String, String>() {{
            put("Type", "String");
            put("Min", "A");
            put("Max", "Z");
        }}, new Hashtable<String, String>() {{
            put("Min", "A");
            put("Max", "Z");
        }}, new Hashtable<String, String>() {{
            put("Min", "Z");
            put("Max", "Z");
        }});
    }

    @Test
    public void testInsertIntoTable() throws DBAppException {
        dbApp.insertIntoTable("Table1", new Hashtable<String, Object>() {{
            put("Column1", "Value1");
            put("Column2", "Value2");
        }});

        assert !(dbApp.getMyTables().contains("Table1"));
    }

    @Test
    public void testUpdateTable() throws DBAppException {
        dbApp.updateTable("Table1", "Column1", new Hashtable<String, Object>() {{
            put("Value", "New Value");
        }});

        HashSet<String> tables = dbApp.getMyTables();
        assertTrue(tables.contains("Table1"));
    }

    @Test
    public void testDeleteFromTable() throws DBAppException {
        dbApp.deleteFromTable("Table1", new Hashtable<String, Object>() {{
            put("Column1", "Value1");
        }});

        HashSet<String> tables = dbApp.getMyTables();
        assertTrue(tables.contains("Table1"));
    }

    @Test
    public void testSelectFromTable() throws DBAppException {
        dbApp.insertIntoTable("Table1", new Hashtable<String, Object>() {{
            put("Column1", "Value1");
            put("Column2", "Value2");
        }});

        CSVReader reader = dbApp.getReader();
        List<String[]> sqlTerms = new ArrayList<>();
        sqlTerms.add(new String[]{"SELECT * FROM Table1 WHERE Column1 = 'Value1' AND Column2 = 'Value2'", "Table1"});
        for (String[] term : sqlTerms) {
            try {
                SQLTerm sqlTerm = new SQLTerm(term[0], term[1]);
                Iterator<String> iterator = dbApp.selectFromTable(sqlTerm.getSQLTerm(), new String[]{"Column1", "Column2"}, new String[]{});
                while (iterator.hasNext()) {
                    Object[] result = iterator.next();
                    assert !(result[0] instanceof DBAppException);
                }
            } catch (DBAppException e) {
                assert !(e.getMessage().equals(sqlTerm.getSQLTerm()));
            }
        }

        Iterator<String> iterator = dbApp.selectFromTable(new SQLTerm("SELECT * FROM Table1", null, new String[]{"Column1"}), new String[]{}, new String[]{"Column1"});

        for (int i = 0; i < iterator.size(); i++) {
            Object[] result = iterator.next();
            assert !(result[0] instanceof DBAppException);
        }

        dbApp.deleteFromTable("Table1", new Hashtable<String, Object>() {{
            put("Column1", "Value1");
        }});

        Iterator<String> iterator2 = dbApp.selectFromTable(new SQLTerm("", null, new String[]{"Column1"}), new String[]{}, new String[]{"Column1"});

        for (int i = 0; i < iterator2.size(); i++) {
            Object[] result = iterator2.next();
            assert !(result[0] instanceof DBAppException);
        }
    }

}