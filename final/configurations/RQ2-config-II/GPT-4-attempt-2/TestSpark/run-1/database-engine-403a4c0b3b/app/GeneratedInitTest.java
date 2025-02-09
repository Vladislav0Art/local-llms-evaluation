package app;

import app.DBApp;
import com.opencsv.exceptions.CsvValidationException;
import exceptions.DBAppException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import util.TypeCaster;
import util.filecontroller.Serializer;
import util.search.SearchEngine;
import util.validation.Validator;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        DBApp dbApp = new DBApp();
        dbApp.init();
        // Add assert statements if any output or change is expected as a result of above method call
    }

}