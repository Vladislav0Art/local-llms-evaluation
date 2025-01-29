package app;

import app.DBApp;
import io.json.simple.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestGetMyTablesWithTable2 {

    @BeforeClass
    public static void setup() {
        Serializer.setEncoding("UTF-8");
    }

    @Test
    public void testGetMyTablesWithTable2() throws DBAppException {
        String[] tables = {"Table1", "Table2"};
        StringBuilder sb = new StringBuilder();
        for (String table : tables) {
            sb.append(dbApp.getMyTables().size()).append(",");
        }
        assertEquals(2, sb.toString().length());
    }

}