package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestAddLongColumnValues {

    @InjectMocks
    private DataFrame dataFrame;

    @Test
    public void testAddLongColumnValues() {
        DataFrame dataFrame = new DataFrame("testName");
        dataFrame.addLongColumn("testColumn", new Long[]{1L, 2L});
        assertNotNull(dataFrame.getColumnNamed("testColumn"));
    }

}