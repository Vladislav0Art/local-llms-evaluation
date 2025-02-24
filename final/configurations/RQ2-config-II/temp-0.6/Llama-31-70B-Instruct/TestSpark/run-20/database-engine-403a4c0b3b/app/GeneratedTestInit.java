package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Test;
import org.mockito.Mockito;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import sql.SQLTerm;
import util.TypeCaster;
import util.filecontroller.Serializer;
import util.search.Searchable;
import util.validation.Validator;

public class GeneratedTestInit {

    @Test
    public void testInit() throws DBAppException {
        DBApp dbApp = new DBApp();
        dbApp.init();
    }

}