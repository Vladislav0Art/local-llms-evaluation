package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGetColumnNamedTest {

    @Test
    public void getColumnNamedTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Column");
        DfColumn column = dataFrame.getColumnNamed("Column");
        assertNotNull(column);
    }

}