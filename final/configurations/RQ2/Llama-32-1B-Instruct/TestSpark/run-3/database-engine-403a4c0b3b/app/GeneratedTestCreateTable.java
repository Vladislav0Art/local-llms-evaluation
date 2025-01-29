package app;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import exceptions.DBAppException;
import util.filecontroller.Serializer;
import storage.*;
import util.TypeCaster;
import util.search.*;
import sql.SQLTerm;
import datamanipulation.CsvReader;
import datamanipulation.CsvWriter;

public class GeneratedTestCreateTable {

    private IDatabase database;
    private Serializer serializer;
    private TypeCaster typeCaster;

    @BeforeEach
    public void setUp() {
        database = new DBApp();
        serializer = new Serializer();
        typeCaster = new TypeCaster();
    }

    @Test
    public void testCreateTable() throws DBAppException {
        Hashtable<String, String> htblColNameType = new Hashtable<>();
        htblColNameType.put("type", "int");
        Hashtable<String, String> htblColNameMin = new Hashtable<>();
        htblColNameMin.put("minValue", "10");
        Hashtable<String, String> htblColNameMax = new Hashtable<>();
        htblColNameMax.put("maxValue", "100");
        database.createTable("my_table", "id", htblColNameType, htblColNameMin, htblColNameMax);
        assertEquals(1, database.insertIntoTable("my_table", Collections.singletonMap("id", 10)));
    }

}