package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import io.github.vmzakharov.ecdataframe.dsl.value.ValueType;
import org.eclipse.collections.impl.factory.Lists;
import org.eclipse.collections.impl.list.primitive.IntInterval;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAddColumn_From_StringTest {

    @Test
    public void addColumn_From_StringTest() {
        DataFrame dataframe = new DataFrame("test");
        Expression expr = mock(Expression.class);
        when(expr.evaluate(any())).thenReturn("Value1");
        dataframe.addColumn("Column1", expr);
        Assert.assertTrue(dataframe.hasColumn("Column1"));
    }

}