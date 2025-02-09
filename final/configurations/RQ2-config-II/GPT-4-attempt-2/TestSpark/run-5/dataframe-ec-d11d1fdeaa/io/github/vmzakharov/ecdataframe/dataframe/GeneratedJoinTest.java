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

public class GeneratedJoinTest {

    @Test
    public void joinTest() {
        DataFrame df1 = new DataFrame("df1").addStringColumn("Column1", Lists.mutable.of("A", "B", "C")).addLongColumn("Column2", Lists.mutable.of(1L, 2L, 3L));
        DataFrame df2 = new DataFrame("df2").addStringColumn("Column1", Lists.mutable.of("A", "B", "C")).addDoubleColumn("Column3", Lists.mutable.of(1.0, 2.0, 3.0));

        DataFrame joinDf = df1.join(df2, Lists.mutable.of("Column1"), Lists.mutable.of("Column1"));

        Assert.assertEquals(3, joinDf.rowCount());
        Assert.assertEquals(3, joinDf.columnCount());
    }

}