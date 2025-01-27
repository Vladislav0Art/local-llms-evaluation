package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GeneratedTestGt06ProtocolDecoderDecode {

    @Test
    public void testGt06ProtocolDecoderDecode() {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = new NetworkMessage("http");

        when(channel.remoteAddress()).thenReturn(remoteAddress);

        assertTrue(Gt06ProtocolDecoder.decode(channel, remoteAddress, msg) instanceof Position);
    }

}