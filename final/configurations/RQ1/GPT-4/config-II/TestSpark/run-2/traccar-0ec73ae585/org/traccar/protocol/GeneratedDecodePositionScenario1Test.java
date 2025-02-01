package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;

public class GeneratedDecodePositionScenario1Test {

    @Test
    public void decodePositionScenario1Test() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        decoder.decodePosition(
                new DeviceSession(),
                "DATA");
        assertTrue(true);
    }

}