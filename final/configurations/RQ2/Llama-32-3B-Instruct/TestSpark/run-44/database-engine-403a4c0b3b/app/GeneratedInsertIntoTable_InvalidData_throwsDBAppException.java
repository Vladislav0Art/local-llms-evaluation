package app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert.*;

public class GeneratedInsertIntoTable_InvalidData_throwsDBAppException {

    @Test
    public void insertIntoTable_InvalidData_throwsDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        assertThrows(DBAppException.class, () -> dbApp.insertIntoTable("tableName", htblColNameValue));
    }

}