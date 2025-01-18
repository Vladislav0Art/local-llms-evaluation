package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.DfColumnSortOrder;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.utility.Iterate;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedAddDateTimeColumnTest {

    @Test
    public void addDateTimeColumnTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDateTimeColumn("Column");
        ImmutableList columns = dataFrame.getColumns();
        Assert.assertEquals(1, columns.size());
    }

}