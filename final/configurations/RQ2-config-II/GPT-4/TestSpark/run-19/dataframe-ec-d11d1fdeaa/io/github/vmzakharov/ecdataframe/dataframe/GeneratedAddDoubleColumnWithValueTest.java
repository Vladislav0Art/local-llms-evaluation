package io.github.vmzakharov.ecdataframe.dataframe;

import io.github.vmzakharov.ecdataframe.dataframe.DfDoubleColumn;
import io.github.vmzakharov.ecdataframe.dataframe.DataFrame;
import io.github.vmzakharov.ecdataframe.dataframe.ValueType;
import io.github.vmzakharov.ecdataframe.dsl.Expression;
import org.eclipse.collections.api.list.ListIterable;
import org.eclipse.collections.impl.list.mutable.primitive.DoubleArrayList;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedAddDoubleColumnWithValueTest {

    @Test
    public void addDoubleColumnWithValueTest() {
        DataFrame dataFrame = new DataFrame("data");
        dataFrame.addDoubleColumn("doubleColumn", DoubleArrayList.newListWith(1.0, 2.0, 3.0));
        assertEquals(3, dataFrame.columnCount());
    }

}