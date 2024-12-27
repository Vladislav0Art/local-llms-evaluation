package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.Protocol;

import java.net.InetSocketAddress;

public class GeneratedGetHasIndex_WildcardMessage_ReturnsFalse {

    @Test
    public void getHasIndex_WildcardMessage_ReturnsFalse() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new WildcardMessage();
        assertFalse(decoder.getHasIndex(channel, remoteAddress, msg));
    }

}