package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestAddDoubleColumnExpression {

    @InjectMocks
    private DataFrame dataFrame;

    @Test
    public void testAddDoubleColumnExpression() {
        DataFrame dataFrame = new DataFrame("testName");
        dataFrame.addDoubleColumn("testColumn", "testExpression");
        assertNotNull(dataFrame.getColumnNamed("testColumn"));
    }

}