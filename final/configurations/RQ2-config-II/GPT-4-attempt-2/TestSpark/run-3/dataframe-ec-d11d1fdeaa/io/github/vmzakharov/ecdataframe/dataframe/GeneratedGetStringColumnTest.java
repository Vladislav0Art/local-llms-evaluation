package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.doReturn;

import org.mockito.Spy;

import static org.junit.Assert.*;

public class GeneratedGetStringColumnTest {

    @Spy
    private DataFrame testDataFrame = new DataFrame("TestDF");

    @Test
    public void getStringColumnTest() {
        testDataFrame.addStringColumn("TestStringColumn");
        assertNotNull(testDataFrame.getStringColumn("TestStringColumn"));
    }

}