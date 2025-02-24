package app;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import app.DBApp;
import app.IDatabase;
import app.exceptions.DBAppException;
import app.storage.CsvReader;
import app.storage.CsvWriter;
import app.util.TypeCaster;
import app.util.filecontroller.Serializer;
import app.util.search.SQLTerm;
import app.util.search.Validator;
import app.util.validation.Validator;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitTest {

    private final DBApp dbApp = new DBApp();

    @Test
    public void initTest() throws DBAppException {
        dbApp.init();
    }

}