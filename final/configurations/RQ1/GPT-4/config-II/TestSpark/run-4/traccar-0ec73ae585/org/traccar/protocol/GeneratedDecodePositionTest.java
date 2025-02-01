package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.helper.Parser;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.traccar.Protocol;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Base64;

import static org.mockito.Mockito.*;

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        String obj = "230621,151530,A,37.983810,23.727539,E,0,0,10,7,100,0,B9FE,E3,aabbccdd, 255,-95dd,1,607d8c10";
        DeviceSession deviceSession = new DeviceSession("deviceSession");

        Position position = decoder.decodePosition(deviceSession, obj);
        Assert.assertEquals(position.getValid(), true);
        Assert.assertEquals(position.getLatitude(), 37.983810, 0);
        Assert.assertEquals(position.getLongitude(), 23.727539, 0);
        Assert.assertEquals(position.get(Position.KEY_RSSI), 7);
        Assert.assertNull(position.get(Position.KEY_ALARM));
    }

}