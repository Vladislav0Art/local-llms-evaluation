package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class GeneratedSealUnsealTest {

    @Test
    public void sealUnsealTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        dataFrame.seal();
        Assert.assertEquals(0, dataFrame.rowCount());
        dataFrame.unseal();
        dataFrame.addRow(new Values("test value"));
        Assert.assertEquals(1, dataFrame.rowCount());
    }

}