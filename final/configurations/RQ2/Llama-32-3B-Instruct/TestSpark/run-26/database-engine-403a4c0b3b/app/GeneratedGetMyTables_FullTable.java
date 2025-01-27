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

public class GeneratedGetMyTables_FullTable {

    @Test
    public void getMyTables_FullTable() {
        DBApp db = new DBApp();
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("id", "int");
        htblColNameType.put("name", "varchar(100)");
        Hashtable<String, String> htblClusteringKeyColumn = new Hashtable<>();
        htblClusteringKeyColumn.put("id", "int");
        db.createTable("test_table", "id", htblColNameType, htblClusteringKeyColumn);
        assertEquals(db.getMyTables(), new HashSet<>(Arrays.asList("test_table")));
    }

}