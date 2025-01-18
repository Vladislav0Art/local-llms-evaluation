package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import org.eclipse.collections.impl.factory.primitive.LongLists;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedAddDateColumnTest {

    @Test
    public void addDateColumnTest() {
        DataFrame dataFrame = new DataFrame("testing");
        dataFrame.addDateColumn("Test_Column", Lists.mutable.of(LocalDate.now(), LocalDate.now()));
        assertEquals("Test_Column", dataFrame.getColumnNamed("Test_Column").getName());
    }

}