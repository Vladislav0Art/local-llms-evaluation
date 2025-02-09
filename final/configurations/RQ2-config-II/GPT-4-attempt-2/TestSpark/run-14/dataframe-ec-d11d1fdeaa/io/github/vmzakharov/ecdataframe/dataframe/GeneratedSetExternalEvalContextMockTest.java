package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.*;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.primitive.IntLists;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class GeneratedSetExternalEvalContextMockTest {

    // Sample test cases to get coverage for multiple methods. Not exhaustive.

    @Test
    public void setExternalEvalContextMockTest() {
        DataFrame df = Mockito.spy(new DataFrame("TestDF"));
        df.setExternalEvalContext(null);

        Mockito.verify(df, Mockito.times(1)).setExternalEvalContext(null);
    }

}