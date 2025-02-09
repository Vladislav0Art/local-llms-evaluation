package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DfColumnStored;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import io.github.vmzakharov.ecdataframe.util.ExpressionParserHelper;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GeneratedAddStringColumnNewColumnNameTest {

    @Test
    public void addStringColumnNewColumnNameTest() {
        DataFrame dataFrame = new DataFrame("test");
        dataFrame.addStringColumn("newColumn");
        Assert.assertEquals("newColumn", dataFrame.getColumnNamed("newColumn").getName());
    }

}