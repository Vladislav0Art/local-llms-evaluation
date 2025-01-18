package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class GeneratedRowCountTest {

    @Test
    public void rowCountTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        Assert.assertEquals(0, dataFrame.rowCount());
        dataFrame.addRow();
        Assert.assertEquals(1, dataFrame.rowCount());
    }

}