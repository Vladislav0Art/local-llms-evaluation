package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.Protocol;

import java.net.InetSocketAddress;

public class GeneratedDecode_FourByteCommand_ReturnsExpectedValue {

    @Test
    public void decode_FourByteCommand_ReturnsExpectedValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new FourByteMessage(1, 2, 3, 4);
        Object result = decoder.decode(channel, remoteAddress, msg);
        assertEquals(16384, result);
    }

}