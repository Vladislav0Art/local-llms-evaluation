package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDecodeHasIndexTrue {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void testDecodeHasIndexTrue() {
        watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertEquals(true, watchProtocolDecoder.getHasIndex());
    }

}