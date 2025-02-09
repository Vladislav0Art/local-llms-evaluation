package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dataframe.DfCursor;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import io.github.vmzakharov.ecdataframe.util.ExpressionParserHelper;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Predicate;

public class GeneratedUnionTest {

    @Test
    public void unionTest() {
        DataFrame df1 = new DataFrame("df1").addStringColumn("Column1", Lists.mutable.of("A", "B", "C"));
        DataFrame df2 = new DataFrame("df2").addStringColumn("Column1", Lists.mutable.of("D", "E", "F"));

        DataFrame unionDf = df1.union(df2);

        Assert.assertEquals(6, unionDf.rowCount());
    }

}