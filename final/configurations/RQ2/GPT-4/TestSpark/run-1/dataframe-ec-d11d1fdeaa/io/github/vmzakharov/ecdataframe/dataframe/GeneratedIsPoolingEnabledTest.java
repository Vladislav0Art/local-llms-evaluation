package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedIsPoolingEnabledTest {

    @Test
    public void isPoolingEnabledTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.enablePooling();
        assertTrue(dataFrame.isPoolingEnabled());
    }

}