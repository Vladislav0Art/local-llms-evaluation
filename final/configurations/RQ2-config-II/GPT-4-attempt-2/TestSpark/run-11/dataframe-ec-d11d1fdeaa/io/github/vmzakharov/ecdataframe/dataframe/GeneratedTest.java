package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigDecimal;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void addStringColumnTest() {
        DataFrame dataFrame = new DataFrame("dataFrame1");
        String expectedColumnName = "name";
        dataFrame.addStringColumn(expectedColumnName);
        assertNotNull(dataFrame.getColumnNamed(expectedColumnName));
    }

    @Test
    public void enablePoolingTest() {
        DataFrame dataFrame = new DataFrame("dataFrame1");
        assertFalse(dataFrame.isPoolingEnabled());
        dataFrame.enablePooling();
        assertTrue(dataFrame.isPoolingEnabled());
    }

    @Test
    public void getColumnAtTest() {
        DataFrame dataFrame = new DataFrame("dataFrame1");
        dataFrame.addStringColumn("name");
        assertNotNull(dataFrame.getColumnAt(0));
    }

    @Test
    public void addRowTest() {
        DataFrame dataFrame = new DataFrame("dataFrame1");
        dataFrame.addStringColumn("name");
        assertEquals(0, dataFrame.rowCount());
        dataFrame.addRow();
        assertEquals(1, dataFrame.rowCount());
    }

    @Test
    public void evaluateExpressionTest() {
        DataFrame dataFrame = mock(DataFrame.class);
        Expression expression = mock(Expression.class);
        when(dataFrame.evaluateExpression(expression, 0)).thenReturn(mock(Value.class));
        assertNotNull(dataFrame.evaluateExpression(expression, 0));
    }

    @Test
    public void dropColumnTest() {
        DataFrame dataFrame = new DataFrame("dataFrame1");
        dataFrame.addStringColumn("name");
        assertTrue(dataFrame.hasColumn("name"));
        dataFrame.dropColumn("name");
        assertFalse(dataFrame.hasColumn("name"));
    }

    @Test
    public void joinTest() {
        DataFrame dataFrame1 = new DataFrame("dataFrame1");
        dataFrame1.addStringColumn("name");
        DataFrame dataFrame2 = new DataFrame("dataFrame2");
        dataFrame2.addStringColumn("name");
        assertNotNull(dataFrame1.join(dataFrame2, "name", "name"));
    }

    @Test
    public void isEmptyTest() {
        DataFrame dataFrame = new DataFrame("dataFrame");
        assertTrue(dataFrame.isEmpty());
        dataFrame.addStringColumn("name");
        dataFrame.addRow();
        assertFalse(dataFrame.isEmpty());
    }

}