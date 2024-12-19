package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestInsert {

    DBApp dbApp = new DBApp();

    @Test
    public void testInsert() throws Exception {
        String query = "INSERT INTO table_name (column_name, column_value) VALUES ('value1', 1)";
        dbApp.insert("table_name", query);
    }

}