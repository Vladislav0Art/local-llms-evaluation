package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        when(decoder.getHasIndex()).thenReturn(true);
        String result = decoder.getHasIndex();
        assertEquals("true", result);
    }

}