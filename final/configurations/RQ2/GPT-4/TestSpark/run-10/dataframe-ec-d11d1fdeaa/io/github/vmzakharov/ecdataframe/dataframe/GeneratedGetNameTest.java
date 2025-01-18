package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        DataFrame dataFrame = new DataFrame("TestDF");
        Assert.assertEquals("TestDF", dataFrame.getName());
    }

}