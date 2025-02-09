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

public class GeneratedCreateIndexTest {

    @Test
    public void createIndexTest() {
        DataFrame df = new DataFrame("TestFrame");
        df.addStringColumn("TestColumn");
        df.addRow(Lists.immutable.of(Expr.stringLiteral("TestValue")));
        df.createIndex("TestIndex", Lists.immutable.of("TestColumn"));
        Assert.assertNotNull(df.index("TestIndex"));
    }

}