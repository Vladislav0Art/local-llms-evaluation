package io.github.vmzakharov.ecdataframe.dataframe;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestConstructor {

    @InjectMocks
    private DataFrame dataFrame;

    @Test
    public void testConstructor() {
        DataFrame dataFrame = new DataFrame("testName");
        assertNotNull(dataFrame);
    }

}