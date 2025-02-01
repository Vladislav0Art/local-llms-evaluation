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

public class GeneratedTest {

    private Protocol protocol = new Protocol();
    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

    @Test
    public void sendResponseTest() {
        Channel channelMock = mock(Channel.class);
        String id = "123";
        String index = "4567";
        String content = "INIT,1";
        decoder.sendResponse(channelMock, id, index, content);

        ByteBuf expectedResponse = Unpooled.copiedBuffer(
                String.format("[%s*%s*%s*%04x*%s]", "XY", id, index, content.length(), content), StandardCharsets.US_ASCII);
        verify(channelMock, times(1)).writeAndFlush(expectedResponse);
    }

    @Test
    public void decodeAlarmTest() {
        int status = 1;
        String result = decoder.decodeAlarm(status);
        assertEquals(Position.ALARM_LOW_BATTERY, result);

        status = 2;
        result = decoder.decodeAlarm(status);
        assertEquals(Position.ALARM_GEOFENCE_EXIT, result);
    }

    @Test
    public void getHasIndexTest() {
        boolean result = decoder.getHasIndex();
        assertEquals(false, result);
    }

    @Test
    public void getManufacturerTest() {
        String result = decoder.getManufacturer();
        assertEquals(null, result);
    }

    @Test
    public void decodePositionTest() {
        DeviceSession deviceSession = mock(DeviceSession.class);
        String data = "231218,121300,A,2704.870898,N,9024.853394,E,0.6,193.8,-49.6,5,3,34,45683,6";
        Position result = decoder.decodePosition(deviceSession, data);
        assertEquals(null, result);
    }

}