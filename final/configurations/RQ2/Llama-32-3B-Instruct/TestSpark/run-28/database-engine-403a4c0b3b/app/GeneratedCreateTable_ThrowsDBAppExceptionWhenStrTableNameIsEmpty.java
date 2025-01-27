package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GeneratedCreateTable_ThrowsDBAppExceptionWhenStrTableNameIsEmpty {

    @Test
    public void createTable_ThrowsDBAppExceptionWhenStrTableNameIsEmpty() throws DBAppException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        new DBApp().createTable("", "strClusteringKeyColumn", htblColNameType, htblColNameMin, htblColNameMax);
    }

}