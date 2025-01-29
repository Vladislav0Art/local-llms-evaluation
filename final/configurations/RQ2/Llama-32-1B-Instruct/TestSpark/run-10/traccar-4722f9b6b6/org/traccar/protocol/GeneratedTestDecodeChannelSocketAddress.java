package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class GeneratedTestDecodeChannelSocketAddress {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);

    @Test
    public void testDecodeChannelSocketAddress() throws Exception {
        Channel channel = Unpooled.buffer().channel();
        SocketAddress remoteAddress = Unpooled.buffer().SocketAddress(123, 456);
        Object msg = Arrays.asList(new NetworkMessage("Hello World"), new WifiAccessPoint("TRACCA", "TRACCA"));
        assertEquals(Arrays.asList(msg), decoder.decode(channel, remoteAddress, msg));
    }

}