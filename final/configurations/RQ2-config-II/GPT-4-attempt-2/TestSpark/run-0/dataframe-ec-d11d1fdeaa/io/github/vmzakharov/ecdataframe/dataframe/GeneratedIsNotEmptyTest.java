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

public class GeneratedIsNotEmptyTest {

    @Test
    public void isNotEmptyTest() {
        DataFrame data = new DataFrame("test");
        data.addStringColumn("strColumn", Lists.mutable.of("str1", "str2", "str3"));
        Assert.assertTrue(data.isNotEmpty());
    }

}