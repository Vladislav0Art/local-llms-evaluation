package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Assert;
import org.junit.Test;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;

import static org.junit.Assert.*;

public class GeneratedAddColumnTest {

    @Test
    public void addColumnTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        DfColumn column = dataFrame.addColumn("TestColumn", ValueType.DOUBLE);

        Assert.assertEquals(1, dataFrame.columnCount());
        Assert.assertEquals("TestColumn", column.getName());
    }

}