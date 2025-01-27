package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;

public class GeneratedGetManufacturer_ReturnsManufacturer {

    @Test
    public void getManufacturer_ReturnsManufacturer() {
        // Given
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        // When
        String manufacturer = decoder.getManufacturer();

        // Then
        assertNotNull(manufacturer);
    }

}