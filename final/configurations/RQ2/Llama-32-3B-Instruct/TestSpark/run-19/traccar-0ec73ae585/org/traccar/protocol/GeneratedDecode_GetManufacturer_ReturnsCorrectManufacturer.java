package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;
import org.mockito.Mockito;

public class GeneratedDecode_GetManufacturer_ReturnsCorrectManufacturer {

    @Test
    public void decode_GetManufacturer_ReturnsCorrectManufacturer() throws Exception {
        // Given
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);

        // When
        String manufacturer = decoder.getManufacturer();

        // Then
        assertEquals(Protocol.WATCH_PROTOCOL, manufacturer);
    }

}