package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void decodePositionTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        String data = "230206,150939,A,22.639580,N,114.023134,E,0.00,0,21.1,6,11,87,306,0,0,200D,,0,460,0,9526,49234,-95";
        Position position = decoder.decodePosition(deviceSessionMock, data);
        assertEquals("watch", position.getProtocol());
        assertEquals(123456789, position.getDeviceId());
        assertEquals(22.639580, position.getLatitude(), 0.000001);
        assertEquals(114.023134, position.getLongitude(), 0.000001);
        assertEquals(UnitsConverter.knotsFromKph(0), position.getSpeed(), 0.00001);
        assertTrue(position.getNetwork().getWifiAccessPoints().contains(WifiAccessPoint.from("00:00:00:00:00:00", -50)));
    }

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(0x1));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(0x2));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(0x4));
        assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(0x4000));
        assertEquals(Position.ALARM_SOS, decoder.decodeAlarm(0x10000));
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(0x20000));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(0x40000));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(0x80000));
        assertEquals(Position.ALARM_REMOVING, decoder.decodeAlarm(0x100000));
        assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(0x200000));
        assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(0x400000));
        assertNull(decoder.decodeAlarm(0x0));
    }

    @Test
    public void decodeTest() throws Exception {
        WatchProtocolDecoder decoder = spy(new WatchProtocolDecoder(new Protocol("watch")));
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        String hexString = "5B38322A313233342A363331372A6266742C32302C2C32302C2C312C302C303132332530303435472C3131392C302C323031363131303830393031322C69646C652C3030304523414343304330423634304230323023474330322C31382C3139313039313332303242090021470934";
        ByteBuf buf = Unpooled.wrappedBuffer(org.apache.commons.codec.binary.Hex.decodeHex(hexString.toCharArray()));
        Object decodedObject = decoder.decode(channel, remoteAddress, buf);

        verify(decoder, times(3)).sendResponse(any(), any(), any(), any());
    }

}