package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

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

public class GeneratedSelectFromTableShouldNotThrowAnyException {

    @Test
    public void selectFromTableShouldNotThrowAnyException() throws Exception {
        DBApp db = new DBApp();
        List<SQLTerm> sqlTerms = new ArrayList<SQLTerm>();
        sqlTerms.add(new SQLTerm("SELECT * FROM test"));
        String[] strarrOperators = new String[0];
        Iterator iterator = db.selectFromTable(sqlTerms, strarrOperators);
        assertTrue(iterator.hasNext());
    }

}