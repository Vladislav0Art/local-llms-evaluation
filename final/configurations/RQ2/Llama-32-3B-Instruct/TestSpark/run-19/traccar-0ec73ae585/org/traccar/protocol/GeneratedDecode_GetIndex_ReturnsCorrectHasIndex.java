package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;
import org.mockito.Mockito;

public class GeneratedDecode_GetIndex_ReturnsCorrectHasIndex {

    @Test
    public void decode_GetIndex_ReturnsCorrectHasIndex() throws Exception {
        // Given
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);

        // When
        boolean hasIndex = decoder.getHasIndex();

        // Then
        assertTrue(hasIndex);
    }

}