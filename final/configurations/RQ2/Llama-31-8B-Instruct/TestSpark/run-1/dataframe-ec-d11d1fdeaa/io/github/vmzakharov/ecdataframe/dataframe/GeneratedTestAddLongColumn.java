package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestAddLongColumn {

    @InjectMocks
    private DataFrame dataFrame;

    @Test
    public void testAddLongColumn() {
        DataFrame dataFrame = new DataFrame("testName");
        DataFrame result = dataFrame.addLongColumn("testColumn");
        assertNotNull(result);
    }

}