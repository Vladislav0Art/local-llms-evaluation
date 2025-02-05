package io.github.vmzakharov.ecdataframe.dataframe;

import static org.junit.Assert.*;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnStored;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.junit.Test;

public class GeneratedNewColumnTest {

    @Test
    public void newColumnTest() {
        DataFrame df = new DataFrame("testDF");

        DfColumnStored result = df.newColumn("testColumn", ValueType.STRING);

        assertNotNull(result);
        assertEquals("testColumn", result.getName());
    }

}