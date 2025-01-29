package app;

import app.DBApp;
import io.json.simple.JSONObject;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestGetMyTablesWithTable1 {

    @BeforeClass
    public static void setup() {
        Serializer.setEncoding("UTF-8");
    }

    @Test
    public void testGetMyTablesWithTable1() throws DBAppException {
        String[] tables = {"Table1"};
        StringBuilder sb = new StringBuilder();
        for (String table : tables) {
            sb.append(dbApp.getMyTables().size()).append(",");
        }
        assertEquals(1, sb.toString().length());
    }

}