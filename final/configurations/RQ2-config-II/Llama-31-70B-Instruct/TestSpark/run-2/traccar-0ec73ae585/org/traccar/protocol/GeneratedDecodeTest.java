package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest {

    @Mock
    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void decodeTest() {
        when(watchProtocolDecoder.decode(null, null, null)).thenReturn(null);
        assertEquals(null, watchProtocolDecoder.decode(null, null, null));
    }

}