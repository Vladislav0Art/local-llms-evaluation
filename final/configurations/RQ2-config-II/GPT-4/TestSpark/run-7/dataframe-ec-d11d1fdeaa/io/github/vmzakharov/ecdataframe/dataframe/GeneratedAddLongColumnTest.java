package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Assert;
import org.junit.Test;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;

import static org.junit.Assert.*;

public class GeneratedAddLongColumnTest {

    @Test
    public void addLongColumnTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addLongColumn("TestColumn");

        Assert.assertEquals(1, dataFrame.columnCount());
        Assert.assertEquals("TestColumn", dataFrame.getColumnAt(0).getName());
    }

}