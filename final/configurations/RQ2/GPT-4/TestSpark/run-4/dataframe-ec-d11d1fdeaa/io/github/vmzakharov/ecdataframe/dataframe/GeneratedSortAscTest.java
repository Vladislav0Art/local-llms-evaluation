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

public class GeneratedSortAscTest {

    @Test
    public void sortAscTest() {
        DataFrame dataFrame = new DataFrame("Test");
        dataFrame.addDoubleColumn("Test");
        dataFrame.addRow(1.2);
        dataFrame.addRow(2.3);
        dataFrame.addRow(0.1);
        dataFrame.sortBy(Lists.immutable.of("Test"), Lists.immutable.of(DfColumnSortOrder.ASC));
        Assert.assertEquals(0.1, dataFrame.getDouble("Test", 0), 0.01);
        Assert.assertEquals(1.2, dataFrame.getDouble("Test", 1), 0.01);
        Assert.assertEquals(2.3, dataFrame.getDouble("Test", 2), 0.01);
    }

}