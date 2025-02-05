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

public class GeneratedGetNameTest {

    @Test
    public void getNameTest() {
        DataFrame dataFrame = new DataFrame("DataFrame1");
        Assert.assertEquals("DataFrame1", dataFrame.getName());

        DataFrame dataFrame2 = new DataFrame("DataFrame2");
        Assert.assertEquals("DataFrame2", dataFrame2.getName());
    }

}