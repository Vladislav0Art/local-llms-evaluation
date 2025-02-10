package app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert.*;

public class GeneratedInsertIntoTable_ValidData_noException {

    @Test
    public void insertIntoTable_ValidData_noException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        dbApp.insertIntoTable("tableName", htblColNameValue);
    }

}