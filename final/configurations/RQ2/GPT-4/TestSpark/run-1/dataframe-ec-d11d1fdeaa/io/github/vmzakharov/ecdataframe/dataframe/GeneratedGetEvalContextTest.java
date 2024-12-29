package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGetEvalContextTest {

    @Test
    public void getEvalContextTest() {
        DataFrame dataFrame = new DataFrame("Test");
        DataFrameEvalContext evalContext = dataFrame.getEvalContext();
        assertNotNull(evalContext);
    }

}