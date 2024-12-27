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
public class GeneratedGetReaderTest_NoException_ReturnsReader {

    private DBApp dbApp;

    @Test
    public void getReaderTest_NoException_ReturnsReader() {
        dbApp = new DBApp();
        CsvReader reader = dbApp.getReader();
        assertNotNull(reader);
    }

}