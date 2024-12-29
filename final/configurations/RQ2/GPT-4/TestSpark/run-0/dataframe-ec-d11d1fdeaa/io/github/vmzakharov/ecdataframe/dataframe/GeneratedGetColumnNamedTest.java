package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import io.github.vmzakharov.ecdataframe.dataframe.AggregateFunction;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetColumnNamedTest {

    @Test
    public void getColumnNamedTest() {
        DataFrame df = new DataFrame("test");
        df.addLongColumn("longCol");
        assertNotNull(df.getColumnNamed("longCol"));
    }

}