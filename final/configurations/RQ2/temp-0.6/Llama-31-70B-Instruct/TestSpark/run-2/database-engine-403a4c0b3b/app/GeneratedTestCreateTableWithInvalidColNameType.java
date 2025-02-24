package app;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Test;
import org.mockito.Mockito;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import storage.IDatabase;
import util.TypeCaster;
import util.filecontroller.Serializer;
import util.search.SQLTerm;
import util.validation.Validator;

public class GeneratedTestCreateTableWithInvalidColNameType {

    @Test
    public void testCreateTableWithInvalidColNameType() throws Exception {
        IDatabase dbApp = new DBApp();
        dbApp.createTable("testTable", "testColumn", null, new Hashtable<>(), new Hashtable<>());
    }

}