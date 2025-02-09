package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfDoubleColumn;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class GeneratedCreateComputedColumnTest {

    @Test
    public void createComputedColumnTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addDoubleColumn("column1", Lists.mutable.of(4.3, 5.5, 6.7));
        df.addDoubleColumn("column2", Lists.mutable.of(3.0, 4.0, 5.0));
        df.createComputedColumn("column3", ValueType.DOUBLE, "column1 + column2");
        Assert.assertEquals(7.3, df.getDouble("column3", 0), 0.01);
        Assert.assertEquals(9.5, df.getDouble("column3", 1), 0.01);
        Assert.assertEquals(11.7, df.getDouble("column3", 2), 0.01);
    }

}