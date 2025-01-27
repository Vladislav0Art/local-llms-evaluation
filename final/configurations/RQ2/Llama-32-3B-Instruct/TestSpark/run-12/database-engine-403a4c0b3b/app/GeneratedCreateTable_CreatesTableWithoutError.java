package app;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateTable_CreatesTableWithoutError {

    @Test
    public void createTable_CreatesTableWithoutError() throws DBAppException, IOException, CsvValidationException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();

        DBApp dbApp = new DBApp();
        dbApp.init();

        dbApp.createTable("testTable", "id", htblColNameType, htblColNameMin, htblColNameMax);
    }

}