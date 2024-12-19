package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSelectFromTable {

    DBApp dbApp = new DBApp();

    @Test
    public void testSelectFromTable() throws Exception {
        String query = "SELECT * FROM table_name";
        SQLTerm[] sqlTerms = {new SQLTerm("row1"), new SQLTerm(1L)};
        Object[] result = dbApp.selectFromTable(sqlTerms);
        System.out.println(result[0]);
    }

}