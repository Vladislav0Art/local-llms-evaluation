package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class GeneratedUnsortResetBitmapTest {

    @Test
    public void unsortResetBitmapTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        dataFrame.addStringColumn("Column1");
        dataFrame.addRow("value1");
        dataFrame.addRow("value2");
        dataFrame.addRow("value3");
        dataFrame.sortBy(Lists.mutable.of("Column1"));
        dataFrame.unsort();
        Assert.assertEquals("value1", dataFrame.getObject("Column1", 0));
        Assert.assertEquals("value2", dataFrame.getObject("Column1", 1));
        Assert.assertEquals("value3", dataFrame.getObject("Column1", 2));
        dataFrame.setFlag(1);
        Assert.assertTrue(dataFrame.isFlagged(1));
        dataFrame.resetBitmap();
        Assert.assertFalse(dataFrame.isFlagged(1));
    }

}