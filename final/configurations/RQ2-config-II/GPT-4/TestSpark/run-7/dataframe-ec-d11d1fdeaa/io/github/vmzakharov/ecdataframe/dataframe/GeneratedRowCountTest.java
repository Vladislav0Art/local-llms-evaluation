package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Assert;
import org.junit.Test;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;

import static org.junit.Assert.*;

public class GeneratedRowCountTest {

    @Test
    public void rowCountTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        dataFrame.addStringColumn("OneColumn");
        dataFrame.addRow(List.of(Value.of("TestData")));

        Assert.assertEquals(1, dataFrame.rowCount());
    }

}