package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;
import org.mockito.Mockito;

public class GeneratedDecode_GetType_ReturnsCorrectType {

    @Test
    public void decode_GetType_ReturnsCorrectType() throws Exception {
        // Given
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);

        // When
        Class<?> type = decoder.getClass();

        // Then
        assertEquals(WatchProtocolDecoder.class, type);
    }

}