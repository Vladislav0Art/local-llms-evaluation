package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodePositionTest {

    private Protocol protocol = new Protocol();
    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

    @Test
    public void decodePositionTest() {
        DeviceSession deviceSession = mock(DeviceSession.class);
        String data = "231218,121300,A,2704.870898,N,9024.853394,E,0.6,193.8,-49.6,5,3,34,45683,6";
        Position result = decoder.decodePosition(deviceSession, data);
        assertEquals(null, result);
    }

}