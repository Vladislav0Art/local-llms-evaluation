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

public class GeneratedSortByExpressionTest {

    @Test
    public void sortByExpressionTest() {
        DataFrame df = new DataFrame("demo");
        df.addStringColumn("Column1", FastList.newListWith("B", "A", "C"));
        df = df.sortByExpression("Column1", DfColumnSortOrder.ASC);
        Assert.assertEquals("A", df.getObject("Column1", 0));
    }

}