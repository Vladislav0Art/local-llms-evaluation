package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        DataFrame dataFrame = new DataFrame("Test");
        assertTrue(dataFrame.isEmpty());
    }

}