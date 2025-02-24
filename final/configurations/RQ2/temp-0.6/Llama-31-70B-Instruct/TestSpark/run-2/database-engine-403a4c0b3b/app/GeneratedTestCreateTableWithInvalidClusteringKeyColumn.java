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

public class GeneratedTestCreateTableWithInvalidClusteringKeyColumn {

    @Test
    public void testCreateTableWithInvalidClusteringKeyColumn() throws Exception {
        IDatabase dbApp = new DBApp();
        dbApp.createTable("testTable", "", new Hashtable<>(), new Hashtable<>(), new Hashtable<>());
    }

}