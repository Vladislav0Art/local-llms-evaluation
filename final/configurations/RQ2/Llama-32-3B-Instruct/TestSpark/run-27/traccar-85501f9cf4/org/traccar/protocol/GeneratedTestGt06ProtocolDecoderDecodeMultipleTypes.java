package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GeneratedTestGt06ProtocolDecoderDecodeMultipleTypes {

    @Test
    public void testGt06ProtocolDecoderDecodeMultipleTypes() {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = new NetworkMessage("http");

        when(channel.remoteAddress()).thenReturn(remoteAddress);

        assertTrue(Gt06ProtocolDecoder.decode(channel, remoteAddress, msg) instanceof Position || Gt06ProtocolDecoder.decode(channel, remoteAddress, msg) instanceof OtherType);
    }

}