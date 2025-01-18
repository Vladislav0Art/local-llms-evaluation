package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedGetStringTest {

    @Test
    public void getStringTest() {
        DataFrame dataFrame = new DataFrame("testing");
        dataFrame.addStringColumn("Test_Column");
        dataFrame.addRow("1", "test");
        assertEquals("test", dataFrame.getString("Test_Column", 0));
    }

}