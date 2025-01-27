package app;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashSet;
import java.utilHashtable;
import java.util.Map.Entry;

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

public class GeneratedSelectFromTable_NoResults {

    @Test
    public void selectFromTable_NoResults() throws DBAppException {
        DBApp db = new DBApp();
        Hashtable<String, Object> htblColNameValue = new Hashtable<>();
        htblColNameValue.put("id", 1);
        htblColNameValue.put("name", "John");
        SQLTerm[] arrSQLTerms = new SQLTerm[]{new SQLTerm()};
        String[] strarrOperators = new String[]{"="};
        Iterator<?> it = db.selectFromTable(arrSQLTerms, strarrOperators);
        assertTrue(it.hasNext());
    }

}