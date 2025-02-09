package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dsl.Expr;
import io.github.vmzakharov.ecdataframe.dsl.value.StringValue;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigDecimal;

public class GeneratedAddRowValuesTest {

    @Test
    public void addRowValuesTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addStringColumn("TestColumn");
        df.addRow("TestValue");
        Assert.assertEquals("TestValue", df.getObject("TestColumn", 0));
    }

}