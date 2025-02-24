package app;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

import com.opencsv.exceptions.CsvValidationException;
import app.DBApp;

@RunWith(PowerMockRunner.class)
public class GeneratedGetWriterTest {

    Serializer .class,TypeCaster .class,Validator .class
})

public class DBAppTest {

    @Mock
    private Serializer serializer;

    @Mock
    private TypeCaster typeCaster;

    @Mock
    private Validator validator;

    @Test
    public void getWriterTest() {
        DBApp app = new DBApp();
        app.getWriter();
    }

}