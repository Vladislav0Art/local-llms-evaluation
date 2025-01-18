package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.api.factory.Lists;
import org.eclipse.collections.api.list.ListIterable;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedAddColumnTest {

    @Test
    public void addColumnTest() {
        DataFrame dataFrame = new DataFrame("testing");
        dataFrame.addColumn("TestColumn", ValueType.STRING);
        assertEquals("TestColumn", dataFrame.getColumnNamed("TestColumn").getName());
    }

}