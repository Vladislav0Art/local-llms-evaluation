package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestDecodeWithChannel {

    @Test
    public void testDecodeWithChannel() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = null; // No remote address needed
        Object msg = new HashMap<>(); // No message needed
        assertTrue(Gt06ProtocolDecoder.decode(channel, remoteAddress, msg) instanceof Gt06ProtocolDecoder);
    }

}