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

public class GeneratedCreateTable_InvalidTableName {

    @Test
    public void createTable_InvalidTableName() {
        DBApp db = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("id", "int");
        Hashtable<String, String> htblClusteringKeyColumn = new Hashtable<>();
        htblClusteringKeyColumn.put("id", "int");
        try {
            db.createTable("", "id", htblColNameType, htblClusteringKeyColumn);
            fail("Expected DBAppException to be thrown");
        } catch (DBAppException e) {
            // expected
        }
    }

}