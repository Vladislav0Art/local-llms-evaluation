package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dsl.DefaultEvalContext;
import org.eclipse.collections.api.list.ImmutableList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedJoinTest {

    @Test
    public void JoinTest() {
        DataFrame dataFrame1 = new DataFrame("Test1");
        dataFrame1.addStringColumn("Column1");
        DataFrame dataFrame2 = new DataFrame("Test2");
        dataFrame2.addStringColumn("Column2");
        DataFrame result = dataFrame1.join(dataFrame2, "Column1", "Column2");
        assertNotNull(result);
    }

}