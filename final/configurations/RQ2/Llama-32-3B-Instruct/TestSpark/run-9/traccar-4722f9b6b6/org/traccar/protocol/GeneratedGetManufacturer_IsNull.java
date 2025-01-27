package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetManufacturer_IsNull {

    @Mock
    private Protocol protocol;

    public void getHasIndex() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        when(protocol.getName()).thenReturn("WATCH");
        when(protocol.getVersion()).thenReturn(1);

        boolean result = decoder.getHasIndex();

        // Assert
        assertTrue(result);
    }

    @Test
    public void getManufacturer_IsNull() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNull(decoder.getManufacturer());
    }

}