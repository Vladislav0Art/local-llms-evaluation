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

public class GeneratedAddDecimalColumnValuesTest {

    @Test
    public void addDecimalColumnValuesTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addDecimalColumn("TestColumn", Lists.immutable.of(new BigDecimal("10.0")));
        Assert.assertEquals(new BigDecimal("10.0"), df.getDecimal("TestColumn", 0));
    }

}