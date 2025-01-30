package app;

import app.*;
import datamanipulation.CsvWriter;
import exceptions.DBAppException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.Hashtable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetWriterTest {

    @Mock
    private CsvWriter csvWriter;

    @Test
    public void getWriterTest() {
        DBApp app = new DBApp();
        assertSame(app.getWriter().getClass(), CsvWriter.class);
    }

}