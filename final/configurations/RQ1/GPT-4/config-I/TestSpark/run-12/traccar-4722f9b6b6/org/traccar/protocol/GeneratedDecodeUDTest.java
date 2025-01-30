package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;

public class GeneratedDecodeUDTest {

    @Test
    public void decodeUDTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(null);

        String msg = "[3G*1234567890*008C*UD,110820,141100,A,-29.358390,S,-49.727460,W,0.00,0.00,0.00,10,22,100,100,0,FFFF,.1,-80,724,10,39708,1246,-1,2]";
        Object decoded = decoder.decode(channel, null, Unpooled.copiedBuffer(msg, StandardCharsets.US_ASCII));

        Assert.assertTrue(decoded instanceof Position);
        Position position = (Position) decoded;

        Assert.assertEquals(position.getProtocol(), protocol.getName());
        Assert.assertEquals(position.getLatitude(), -29.358390, 0.000001);
        Assert.assertEquals(position.getLongitude(), -49.727460, 0.000001);
        Assert.assertEquals(position.get(Position.KEY_SATELLITES), 10);
        Assert.assertEquals(position.get(Position.KEY_RSSI), 22);
        Assert.assertEquals(position.get(Position.KEY_BATTERY_LEVEL), 100);
        Assert.assertEquals(position.get(Position.KEY_STEPS), 100);
    }

}