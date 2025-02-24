package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDecodeHasIndexFalse {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void testDecodeHasIndexFalse() {
        watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertEquals(false, watchProtocolDecoder.getHasIndex());
    }

}