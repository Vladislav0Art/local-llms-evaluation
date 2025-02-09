package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsNotEmptyTest {

    @Test
    public void isNotEmptyTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addStringColumn("column1");
        dataFrame.addRow(Lists.immutable.of(Value.of("Test")));
        assertTrue(dataFrame.isNotEmpty());
    }

}