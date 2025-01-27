package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecode_Watch_Scenario2 {

    @Test
    public void decode_Watch_Scenario2() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.copiedBuffer("0123456789", 10);

        // Act and Assert
        assertEquals(true, decoder.decode(buf));
    }

}