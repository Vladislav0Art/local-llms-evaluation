package app;

import app.DBApp;
import io.json.simple.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestGetMyTablesWithTable3 {

    @BeforeClass
    public static void setup() {
        Serializer.setEncoding("UTF-8");
    }

    @Test
    public void testGetMyTablesWithTable3() throws DBAppException {
        String[] tables = {"Table1", "Table2", "Table3"};
        StringBuilder sb = new StringBuilder();
        for (String table : tables) {
            sb.append(dbApp.getMyTables().size()).append(",");
        }
        assertEquals(3, sb.toString().length());
    }

}