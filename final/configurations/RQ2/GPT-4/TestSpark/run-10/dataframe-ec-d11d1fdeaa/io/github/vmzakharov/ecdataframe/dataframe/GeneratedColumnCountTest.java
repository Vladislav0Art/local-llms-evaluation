package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class GeneratedColumnCountTest {

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        Assert.assertEquals(0, dataFrame.columnCount());
        dataFrame.addStringColumn("Column1");
        Assert.assertEquals(1, dataFrame.columnCount());
    }

}