package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedColumnCountTest {

    @Test
    public void columnCountTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("column1");
        dataFrame.addStringColumn("column2");
        assertEquals(2, dataFrame.columnCount());
    }

}