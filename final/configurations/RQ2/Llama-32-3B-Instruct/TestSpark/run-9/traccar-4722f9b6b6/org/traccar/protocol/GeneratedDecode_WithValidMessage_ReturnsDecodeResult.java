package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_WithValidMessage_ReturnsDecodeResult {

    @Mock
    private Protocol protocol;

    @Test
    public void decode_WithValidMessage_ReturnsDecodeResult() throws Exception {
        // Arrange
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        byte[] bytes = "abcd".getBytes();
        when(protocol.getName()).thenReturn("WATCH");
        when(protocol.getVersion()).thenReturn(1);

        ByteBuf buffer = Unpooled.buffer();
        buffer.writeBytes(bytes);
        NetworkMessage message = new NetworkMessage(buffer, protocol.getName(), 1);

        // Act
        Object decodeResult = decoder.decode(null, null, message);

        // Assert
        assertNotNull(decodeResult);
    }

}