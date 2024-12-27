package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.Protocol;

import java.net.InetSocketAddress;

public class GeneratedDecode_TwoByteCommand_ReturnsExpectedValue {

    @Test
    public void decode_TwoByteCommand_ReturnsExpectedValue() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new TwoByteMessage((byte) 1, (byte) 2);
        Object result = decoder.decode(channel, remoteAddress, msg);
        assertEquals(0x12, result);
    }

}