package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Assert;
import org.junit.Test;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;

import static org.junit.Assert.*;

public class GeneratedRowCountEmptyTest {

    @Test
    public void rowCountEmptyTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        Assert.assertEquals(0, dataFrame.rowCount());
    }

}