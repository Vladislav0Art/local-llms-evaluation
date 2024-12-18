package app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestDeleteFromTable {

    private DBApp dbApp = new DBApp();

    @Test
    public void testDeleteFromTable() {
        String tableName = "testTable";
        TableSchemaImpl tableColumnsType = new TableSchemaImpl();
        tableColumnsType.addColumn("column1", "int");
        tableColumnsType.addColumn("column2", "varchar(255)");
        dbApp.createTable(tableName, null, tableColumnsType, null, null);
        dbApp.deleteFromTable(tableName, null);
    }
}

class DBApp {
    public String[][] getMyTables() {
        return new String[0][];
    }

    public void init() {
    }

    public Class<?>[] getClassTypes() {
        return new Class<?>[0];
    }

    public Object[] getInstanceArray() {
        return new Object[]{};
    }
}

class DBAppCsvReader implements CsvReader {
    private Schema schema;

    public DBAppCsvReader(Schema schema) {
        this.schema = schema;
    }

    @Override
    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    @Override
    public CSVReader getCsvReader() {
        return new DbAppCsvReader(schema);
    }
}

class DBAppCsvWriter implements CsvWriter {
    private Schema schema;

    public DBAppCsvWriter(Schema schema) {
        this.schema = schema;
    }

    @Override
    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    @Override
    public CSVWriter getWriter() {
        return new DbAppCsvWriter(schema);
    }
}

}