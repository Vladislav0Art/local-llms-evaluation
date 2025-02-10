package app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert.*;

public class GeneratedDeleteFromTable_InvalidData_throwsDBAppException {

    @Test
    public void deleteFromTable_InvalidData_throwsDBAppException() throws DBAppException {
        DBApp dbApp = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        assertThrows(DBAppException.class, () -> dbApp.deleteFromTable("tableName", htblColNameValue));
    }

}