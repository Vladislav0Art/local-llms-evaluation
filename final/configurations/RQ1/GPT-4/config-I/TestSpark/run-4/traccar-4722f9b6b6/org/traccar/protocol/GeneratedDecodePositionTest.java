package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.socket.SocketAddress;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        DeviceSession deviceSession = new DeviceSession("1");
        String data = "190618,130330,A,4044.59000000,N,07401.32800000,W,0.00,0.00,0.000000,0,0,90,0000,0,2";
        Position position = decoder.decodePosition(deviceSession, data);
        Assert.assertNotNull(position);
    }

}