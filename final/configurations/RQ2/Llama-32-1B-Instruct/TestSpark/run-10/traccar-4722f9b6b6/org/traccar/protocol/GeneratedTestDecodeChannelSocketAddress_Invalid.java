package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class GeneratedTestDecodeChannelSocketAddress_Invalid {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);

    @Test
    public void testDecodeChannelSocketAddress_Invalid() {
        Channel channel = Unpooled.buffer().channel();
        SocketAddress remoteAddress = null;
        Object msg = Arrays.asList(new NetworkMessage("Hello World"), new WifiAccessPoint("TRACCA", "TRACCA"));
        assertEquals(Arrays.asList(msg), decoder.decode(channel, remoteAddress, msg));
    }

}