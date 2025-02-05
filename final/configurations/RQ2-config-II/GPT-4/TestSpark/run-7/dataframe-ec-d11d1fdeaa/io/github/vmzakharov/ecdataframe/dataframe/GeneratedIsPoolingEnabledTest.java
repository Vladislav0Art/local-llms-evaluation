package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Assert;
import org.junit.Test;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;

import static org.junit.Assert.*;

public class GeneratedIsPoolingEnabledTest {

    @Test
    public void isPoolingEnabledTest() {
        DataFrame dataFrame = new DataFrame("TestFrame");
        Assert.assertFalse(dataFrame.isPoolingEnabled());

        dataFrame.enablePooling();
        Assert.assertTrue(dataFrame.isPoolingEnabled());
    }

}