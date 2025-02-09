package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.doReturn;

import org.mockito.Spy;

import static org.junit.Assert.*;

public class GeneratedUnsortTest {

    @Spy
    private DataFrame testDataFrame = new DataFrame("TestDF");

    @Test
    public void unsortTest() {
        testDataFrame.addStringColumn("TestStringColumn");
        testDataFrame.addRow("B");
        testDataFrame.addRow("A");
        testDataFrame.sortBy(Lists.immutable.of("TestStringColumn"));

        assertEquals("A", testDataFrame.getString("TestStringColumn", 0));

        testDataFrame.unsort();
        assertEquals("B", testDataFrame.getString("TestStringColumn", 0));
    }

}