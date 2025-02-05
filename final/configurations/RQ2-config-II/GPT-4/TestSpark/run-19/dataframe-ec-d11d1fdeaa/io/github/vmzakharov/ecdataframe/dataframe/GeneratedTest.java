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

public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("data");
        dataFrame.addStringColumn("stringColumn");
        assertTrue(dataFrame.hasColumn("stringColumn"));
    }

    @Test
    public void addLongColumnWithValueTest() {
        DataFrame dataFrame = new DataFrame("data");
        dataFrame.addLongColumn("longColumn", IntLists.mutable.of(1, 2, 3));
        assertEquals(3, dataFrame.columnCount());
    }

    @Test
    public void addDoubleColumnWithValueTest() {
        DataFrame dataFrame = new DataFrame("data");
        dataFrame.addDoubleColumn("doubleColumn", DoubleArrayList.newListWith(1.0, 2.0, 3.0));
        assertEquals(3, dataFrame.columnCount());
    }

    @Test
    public void addDecimalColumnWithValueTest() {
        DataFrame dataFrame = new DataFrame("data");
        DoubleArrayList values = DoubleArrayList.newListWith(1.0, 2.0, 3.0);
        dataFrame.addDecimalColumn("decimalColumn", values.castToList());
        assertEquals(3, dataFrame.columnCount());
    }

    @Test
    public void getNameTest() {
        DataFrame dataFrame = new DataFrame("data");
        assertEquals("data", dataFrame.getName());
    }

    @Test
    public void addColumnWithValueTypeTest() {
        DataFrame dataFrame = new DataFrame("data");
        dataFrame.addColumn("column", ValueType.DOUBLE);
        assertEquals(1, dataFrame.columnCount());
    }

    @Test
    public void hasColumnTest() {
        DataFrame dataFrame = new DataFrame("data");
        assertFalse(dataFrame.hasColumn("stringColumn"));
        dataFrame.addStringColumn("stringColumn");
        assertTrue(dataFrame.hasColumn("stringColumn"));
    }

    @Test
    public void getDoubleColumnTest() {
        DataFrame dataFrame = new DataFrame("data");
        dataFrame.addDoubleColumn("doubleColumn", DoubleArrayList.newListWith(1.0, 2.0, 3.0));
        DfDoubleColumn doubleColumn = dataFrame.getDoubleColumn("doubleColumn");
        assertEquals("doubleColumn", doubleColumn.getName());
    }

    @Test
    public void getEvalContextTest() {
        DataFrame dataFrame = new DataFrame("data");
        assertNotNull(dataFrame.getEvalContext());
    }

    @Test
    public void evaluateExpressionTest() {
        DataFrame dataFrame = new DataFrame("data");
        Expression expression = mock(Expression.class);
        dataFrame.evaluateExpression(expression, 0);
        verify(expression).visit(mock(InMemoryEvaluationVisitor.class));
    }

}