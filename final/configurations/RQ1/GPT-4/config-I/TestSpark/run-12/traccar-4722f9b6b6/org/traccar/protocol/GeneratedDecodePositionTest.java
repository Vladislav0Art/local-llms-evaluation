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

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        DeviceSession deviceSession = mock(DeviceSession.class);
        when(deviceSession.getDeviceId()).thenReturn(1l);

        String data = "110820,141100,A,-29.358390,S,-49.727460,W,0.00,0.00,0.00,10,22,100,100,0,FFFF,.1,-80,724,10,39708,1246,-1,2";
        Position position = decoder.decodePosition(deviceSession, data);

        Assert.assertEquals(position.getProtocol(), protocol.getName());
        Assert.assertEquals(position.getLatitude(), -29.358390, 0.000001);
        Assert.assertEquals(position.getLongitude(), -49.727460, 0.000001);
        Assert.assertEquals(position.getDeviceId(), 1l);
        Assert.assertEquals(position.get(Position.KEY_SATELLITES), 10);
        Assert.assertEquals(position.get(Position.KEY_RSSI), 22);
        Assert.assertEquals(position.get(Position.KEY_BATTERY_LEVEL), 100);
        Assert.assertEquals(position.get(Position.KEY_STEPS), 100);
    }

}