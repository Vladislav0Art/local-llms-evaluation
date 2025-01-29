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

public class GeneratedTestGetWriter {

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
    public void testGetWriter() {
        CsvWriter writer = new CsvWriter(database);
        assertNotNull(writer);
    }

}