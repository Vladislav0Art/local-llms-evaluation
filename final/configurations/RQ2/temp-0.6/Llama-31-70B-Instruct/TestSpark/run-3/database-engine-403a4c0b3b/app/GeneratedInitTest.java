package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Test;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import storage.IDatabase;
import util.TypeCaster;
import util.filecontroller.Serializer;
import util.search.SQLTerm;
import util.validation.Validator;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

}