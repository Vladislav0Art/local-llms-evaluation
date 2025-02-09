package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAsCsvStringTest {

    @Test
    public void asCsvStringTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("CString").last().add("A");
        dataFrame.addStringColumn("DString").last().add("B");
        String expectedCSV = "CString,DString\nA,B\n";
        Assert.assertEquals(expectedCSV, dataFrame.asCsvString());
    }

}