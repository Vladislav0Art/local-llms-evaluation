package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.factory.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.mockito.Mockito.*;

public class GeneratedGetObjectTest {

    @Test
    public void getObjectTest() {
        DataFrame dataFrame = new DataFrame("testData");
        ListIterable<LocalDate> values = Lists.immutable.of(LocalDate.of(2022, 4, 12), LocalDate.of(2022, 4, 13));
        dataFrame.addDateColumn("dateColumn", values);
        Assert.assertEquals(LocalDate.of(2022, 4, 12), dataFrame.getObject("dateColumn", 0));
    }

}