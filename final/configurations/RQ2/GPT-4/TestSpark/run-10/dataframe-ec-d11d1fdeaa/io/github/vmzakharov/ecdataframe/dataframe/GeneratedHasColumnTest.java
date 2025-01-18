package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class GeneratedHasColumnTest {

    @Test
    public void hasColumnTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        Assert.assertFalse(dataFrame.hasColumn("Column1"));
        dataFrame.addStringColumn("Column1");
        Assert.assertTrue(dataFrame.hasColumn("Column1"));
    }

}