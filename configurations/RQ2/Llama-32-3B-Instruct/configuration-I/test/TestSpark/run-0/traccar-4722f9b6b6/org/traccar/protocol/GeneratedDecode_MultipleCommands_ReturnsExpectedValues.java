package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.Protocol;

import java.net.InetSocketAddress;

public class GeneratedDecode_MultipleCommands_ReturnsExpectedValues {

    @Test
    public void decode_MultipleCommands_ReturnsExpectedValues() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = new Channel();
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 0);
        Object msg = new MultipleByteMessage((byte) 1, (byte) 2, (byte) 3, (byte) 4);
        Object[] result = decoder.decode(channel, remoteAddress, msg);
        assertEquals(4, result.length);
    }

}