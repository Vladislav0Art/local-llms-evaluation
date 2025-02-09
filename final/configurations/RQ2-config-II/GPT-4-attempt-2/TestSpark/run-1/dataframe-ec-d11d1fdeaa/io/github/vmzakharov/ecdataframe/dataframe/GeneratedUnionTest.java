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

public class GeneratedUnionTest {

    @Test
    public void unionTest() {
        DataFrame df1 = new DataFrame("TestFrame1");
        df1.addStringColumn("TestColumn");
        df1.addRow(Lists.immutable.of(Expr.stringLiteral("TestValue1")));
        DataFrame df2 = new DataFrame("TestFrame2");
        df2.addStringColumn("TestColumn");
        df2.addRow(Lists.immutable.of(Expr.stringLiteral("TestValue2")));
        DataFrame dfUnion = df1.union(df2);
        Assert.assertEquals(2, dfUnion.rowCount());
    }

}