package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private DataFrame dataFrame;

    @Test
    public void testConstructor() {
        DataFrame dataFrame = new DataFrame("testName");
        assertNotNull(dataFrame);
    }

    @Test
    public void testAddStringColumn() {
        DataFrame dataFrame = new DataFrame("testName");
        dataFrame.addStringColumn("testColumn");
        assertNotNull(dataFrame.getColumnNamed("testColumn"));
    }

    @Test
    public void testAddStringColumnExpression() {
        DataFrame dataFrame = new DataFrame("testName");
        dataFrame.addStringColumn("testColumn", "testExpression");
        assertNotNull(dataFrame.getColumnNamed("testColumn"));
    }

    @Test
    public void testAddLongColumn() {
        DataFrame dataFrame = new DataFrame("testName");
        dataFrame.addLongColumn("testColumn");
        assertNotNull(dataFrame.getColumnNamed("testColumn"));
    }

    @Test
    public void testAddLongColumnExpression() {
        DataFrame dataFrame = new DataFrame("testName");
        dataFrame.addLongColumn("testColumn", "testExpression");
        assertNotNull(dataFrame.getColumnNamed("testColumn"));
    }

    @Test
    public void testAddDoubleColumn() {
        DataFrame dataFrame = new DataFrame("testName");
        dataFrame.addDoubleColumn("testColumn");
        assertNotNull(dataFrame.getColumnNamed("testColumn"));
    }

    @Test
    public void testAddDoubleColumnExpression() {
        DataFrame dataFrame = new DataFrame("testName");
        dataFrame.addDoubleColumn("testColumn", "testExpression");
        assertNotNull(dataFrame.getColumnNamed("testColumn"));
    }

}