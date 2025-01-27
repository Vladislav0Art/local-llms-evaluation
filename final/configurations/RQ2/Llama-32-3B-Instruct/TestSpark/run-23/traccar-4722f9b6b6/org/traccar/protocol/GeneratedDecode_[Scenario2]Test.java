package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDecode_[Scenario2]

Test {

    @Test
    public void decode_[ Scenario2]Test() {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Mockito.when(decoder.getHasIndex()).thenReturn(false);
        ByteBuf buf = Unpooled.copiedBuffer("0123456789", StandardCharsets.UTF_8);

        // Act
        Object result = decoder.decode(null, null, buf);

        // Assert
        assertNull(result);
    }

}