package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.doReturn;

import org.mockito.Spy;

import static org.junit.Assert.*;

public class GeneratedAddLongColumnTest {

    @Spy
    private DataFrame testDataFrame = new DataFrame("TestDF");

    @Test
    public void addLongColumnTest() {
        testDataFrame.addLongColumn("TestLongColumn");
        assertEquals(1, testDataFrame.columnCount());
        assertTrue(testDataFrame.hasColumn("TestLongColumn"));
    }

}