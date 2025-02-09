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

public class GeneratedGetObjectOutOfRangeTest {

    @Test
    public void getObjectOutOfRangeTest() {
        DataFrame dataFrame = new DataFrame("testData");
        ListIterable<LocalDateTime> values = Lists.immutable.of(LocalDateTime.now());
        dataFrame.addDateTimeColumn("dateTimeColumn", values);
        dataFrame.getObject("dateTimeColumn", 2);
    }

}