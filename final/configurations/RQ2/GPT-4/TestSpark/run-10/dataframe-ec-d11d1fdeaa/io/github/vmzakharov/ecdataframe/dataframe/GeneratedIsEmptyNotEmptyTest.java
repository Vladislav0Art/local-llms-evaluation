package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class GeneratedIsEmptyNotEmptyTest {

    @Test
    public void isEmptyNotEmptyTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        Assert.assertTrue(dataFrame.isEmpty());
        Assert.assertFalse(dataFrame.isNotEmpty());
        dataFrame.addRow();
        Assert.assertFalse(dataFrame.isEmpty());
        Assert.assertTrue(dataFrame.isNotEmpty());
    }

}