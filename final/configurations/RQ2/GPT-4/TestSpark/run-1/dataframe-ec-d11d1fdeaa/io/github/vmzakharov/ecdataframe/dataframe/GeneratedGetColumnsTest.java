package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dsl.DefaultEvalContext;
import org.eclipse.collections.api.list.ImmutableList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedGetColumnsTest {

    @Test
    public void GetColumnsTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("Column1");
        ImmutableList<DfColumn> columns = dataFrame.getColumns();
        assertEquals(1, columns.size());
    }

}