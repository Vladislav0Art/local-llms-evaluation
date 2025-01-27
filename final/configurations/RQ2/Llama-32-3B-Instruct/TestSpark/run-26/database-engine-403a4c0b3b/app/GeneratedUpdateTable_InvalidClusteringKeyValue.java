package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashSet;
import java.utilHashtable;
import java.util.Map.Entry;

import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import util.filecontroller.Serializer;
import storage.*;
import util.TypeCaster;
import util.search.*;
import sql.SQLTerm;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;
import util.validation.Validator;

public class GeneratedUpdateTable_InvalidClusteringKeyValue {

    @Test
    public void updateTable_InvalidClusteringKeyValue() {
        DBApp db = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        try {
            db.updateTable("test_table", "a", htblColNameValue);
            fail("Expected DBAppException to be thrown");
        } catch (DBAppException e) {
            // expected
        }
    }

}