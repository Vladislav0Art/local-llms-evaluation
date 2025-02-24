package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestHasIndex {

    private final WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));

    @Test
    public void testHasIndex() {
        assertEquals(true, watchProtocolDecoder.getHasIndex());
    }

}