package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestAddStringColumnValues {

    @InjectMocks
    private DataFrame dataFrame;

    @Test
    public void testAddStringColumnValues() {
        DataFrame dataFrame = new DataFrame("testName");
        dataFrame.addStringColumn("testColumn", Lists.mutable.of("testValue1", "testValue2"));
        assertNotNull(dataFrame.getColumnNamed("testColumn"));
    }

}