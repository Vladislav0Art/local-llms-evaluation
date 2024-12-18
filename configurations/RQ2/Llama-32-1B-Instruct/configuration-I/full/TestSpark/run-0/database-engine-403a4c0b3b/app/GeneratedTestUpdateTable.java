package app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestUpdateTable {

    private DBApp dbApp = new DBApp();

    @Test
    public void testUpdateTable() {
        String tableName = "testTable";
        TableSchemaImpl tableColumnsType = new TableSchemaImpl();
        tableColumnsType.addColumn("column1", "int");
        tableColumnsType.addColumn("column2", "varchar(255)");
        dbApp.createTable(tableName, null, tableColumnsType, null, null);
        dbApp.updateTable(tableName, null, new Object[]{1L, "value1"});
    }

}