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

public class GeneratedGetDoubleTest {

    @Test
    public void getDoubleTest() {
        DataFrame df = new DataFrame("testFrame");
        df.addDoubleColumn("column1", Arrays.asList(135.5d, 124.5d, 189.2d));
        double value = df.getDouble("column1", 1);
        Assert.assertEquals(124.5d, value, 0);
    }

}