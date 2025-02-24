package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetManufacturer {

    @InjectMocks
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void testGetManufacturer() {
        String result = watchProtocolDecoder.getManufacturer();
        Assert.assertEquals("Watch", result);
    }

}