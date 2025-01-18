package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class GeneratedAddStringColumnTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        dataFrame.addStringColumn("Column1");
        Assert.assertEquals(1, dataFrame.columnCount());
        Assert.assertTrue(dataFrame.hasColumn("Column1"));
        Assert.assertEquals("Column1", dataFrame.getColumnAt(0).getName());
    }

}