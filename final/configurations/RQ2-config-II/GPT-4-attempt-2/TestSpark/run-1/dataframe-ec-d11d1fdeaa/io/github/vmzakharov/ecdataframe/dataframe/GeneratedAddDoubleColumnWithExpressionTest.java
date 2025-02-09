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

public class GeneratedAddDoubleColumnWithExpressionTest {

    @Test
    public void addDoubleColumnWithExpressionTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addDoubleColumn("TestColumn", "2.0");
        Assert.assertEquals(2.0, df.getDouble("TestColumn", 0), 0);
    }

}