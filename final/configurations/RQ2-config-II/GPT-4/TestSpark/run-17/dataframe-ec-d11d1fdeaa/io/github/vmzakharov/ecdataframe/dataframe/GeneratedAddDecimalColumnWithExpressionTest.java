package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.EvalContext;
import io.github.vmzakharov.ecdataframe.dsl.value.Value;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.api.list.primitive.MutableIntList;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedAddDecimalColumnWithExpressionTest {

    @Test
    public void addDecimalColumnWithExpressionTest() {
        DataFrame dataFrame = new DataFrame("DataFrame1");
        ListIterable<BigDecimal> decimals = Mockito.mock(ListIterable.class);
        dataFrame.addDecimalColumn("ColumnDecimal", decimals);
    }

}