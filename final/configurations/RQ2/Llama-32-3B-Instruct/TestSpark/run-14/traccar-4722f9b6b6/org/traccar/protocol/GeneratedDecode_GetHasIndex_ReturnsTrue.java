package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;

public class GeneratedDecode_GetHasIndex_ReturnsTrue {

    @Test
    public void decode_GetHasIndex_ReturnsTrue() {
        // Given
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // When
        boolean hasIndex = decoder.getHasIndex();

        // Then
        assertTrue(hasIndex);
    }

}