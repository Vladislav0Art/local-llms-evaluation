package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.Protocol;

import java.net.InetSocketAddress;

public class GeneratedDecode_WildcardMessage_ReturnsNull {

    @Test
    public void decode_WildcardMessage_ReturnsNull() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = null;
        Object result = decoder.decode(channel, remoteAddress, msg);
        assertNull(result);
    }

}