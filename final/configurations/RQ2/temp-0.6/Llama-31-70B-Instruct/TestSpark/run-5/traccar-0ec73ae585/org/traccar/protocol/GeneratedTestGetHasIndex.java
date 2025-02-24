package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetHasIndex {

    @InjectMocks
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void testGetHasIndex() {
        boolean result = watchProtocolDecoder.getHasIndex();
        Assert.assertTrue(result);
    }

}