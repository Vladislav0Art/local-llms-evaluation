package app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.any;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetWriterTest_NoException_ReturnsWriter {

    private DBApp dbApp;

    @Test
    public void getWriterTest_NoException_ReturnsWriter() {
        dbApp = new DBApp();
        CsvWriter writer = dbApp.getWriter();
        assertNotNull(writer);
    }

}