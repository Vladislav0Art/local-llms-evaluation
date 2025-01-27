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

public class GeneratedGetWriter_NullInput {

    @Test
    public void getWriter_NullInput() {
        DBApp db = new DBApp();
        assertThrows(DBAppException.class, () -> db.getWriter(null));
    }

}