package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import app.DBApp;
import app.DBAppException;
import app.IDatabase;
import app.SearchResult;
import app.Serializer;
import app.Table;
import app.TypeCaster;
import app.Validator;
import app.datamanipulation.CsvReader;
import app.datamanipulation.CsvWriter;
import app.search.Selector;
import app.search.SQLTerm;
import app.storage.ClusteringKey;
import app.util.exceptions.CsvValidationException;
import app.util.filecontroller.Serializer;
import app.util.search.SearchResult;
import app.util.search.Selector;
import app.util.validation.Validator;

public class GeneratedTestInit {

    private DBApp app;
    private Hashtable<String, Object> htblColNameValue;

    @Before
    public void setUp() {
        app = new DBApp();
        htblColNameValue = new Hashtable<>();
    }

    @Test
    public void testInit() {
        app.init();
        assertTrue(app.getMyTables().isEmpty());
    }

}