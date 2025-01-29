package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class GeneratedTestDecodeNetwork_Invalid {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);

    @Test
    public void testDecodeNetwork_Invalid() {
        Network network = null;
        Object msg = Arrays.asList(network);
        assertEquals(Arrays.asList(msg), decoder.decode(new Channel(), Unpooled.buffer().SocketAddress(123, 456), msg));
    }

}