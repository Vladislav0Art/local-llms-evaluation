package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecode_Watch_Scenario1 {

    @Test
    public void decode_Watch_Scenario1() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.copiedBuffer("0123456789", 10);

        // Act and Assert
        assertEquals(false, decoder.decode(buf));
    }

}