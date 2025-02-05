package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Assert;
import org.junit.Test;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;

import static org.junit.Assert.*;

public class GeneratedColumnCountTest {

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("OneColumn");
        dataFrame.addStringColumn("TwoColumn");
        dataFrame.addStringColumn("ThreeColumn");

        Assert.assertEquals(3, dataFrame.columnCount());
    }

}