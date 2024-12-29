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
        DataFrame result = dataFrame.addStringColumn("testColumn");
        assertNotNull(result);
    }

    @Test
    public void testAddStringColumnExpression() {
        DataFrame dataFrame = new DataFrame("testName");
        DataFrame result = dataFrame.addStringColumn("testColumn", "testExpression");
        assertNotNull(result);
    }

    @Test
    public void testAddStringColumnValues() {
        DataFrame dataFrame = new DataFrame("testName");
        DataFrame result = dataFrame.addStringColumn("testColumn", Lists.mutable.of("testValue1", "testValue2"));
        assertNotNull(result);
    }

    @Test
    public void testAddLongColumn() {
        DataFrame dataFrame = new DataFrame("testName");
        DataFrame result = dataFrame.addLongColumn("testColumn");
        assertNotNull(result);
    }

    @Test
    public void testAddLongColumnExpression() {
        DataFrame dataFrame = new DataFrame("testName");
        DataFrame result = dataFrame.addLongColumn("testColumn", "testExpression");
        assertNotNull(result);
    }

    @Test
    public void testAddLongColumnValues() {
        DataFrame dataFrame = new DataFrame("testName");
        DataFrame result = dataFrame.addLongColumn("testColumn", Lists.mutable.of(1L, 2L));
        assertNotNull(result);
    }

    @Test
    public void testAddDoubleColumn() {
        DataFrame dataFrame = new DataFrame("testName");
        DataFrame result = dataFrame.addDoubleColumn("testColumn");
        assertNotNull(result);
    }

    @Test
    public void testAddDoubleColumnExpression() {
        DataFrame dataFrame = new DataFrame("testName");
        DataFrame result = dataFrame.addDoubleColumn("testColumn", "testExpression");
        assertNotNull(result);
    }

}