package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

public class GeneratedTestDecodeWithIndex {

    @Test
    public void testDecodeWithIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        when(decoder.getHasIndex()).thenReturn(true);
        Object result = decoder.decode(null, null, "test");
        assertNotNull(result);
        assertEquals(result.getClass(), NetworkMessage.class);
    }

}