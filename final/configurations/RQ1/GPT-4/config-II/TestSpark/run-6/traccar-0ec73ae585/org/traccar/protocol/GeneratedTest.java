package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void decodeAlarmGeneralTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(1));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(2));
        assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(16384));
        assertEquals(Position.ALARM_SOS, decoder.decodeAlarm(65536));
        assertNull(decoder.decodeAlarm(9999)); // This scenario tests 'No alarm'
    }

    @Test
    public void decodePositionFailedTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        DeviceSession deviceSession = mock(DeviceSession.class);
        assertNull(decoder.decodePosition(deviceSession, ""));
    }

    @Test
    public void decodePositionValidTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        DeviceSession deviceSession = mock(DeviceSession.class);
        when(deviceSession.getDeviceId()).thenReturn(12345L);
        assertNotNull(decoder.decodePosition(deviceSession, "170422,083402,A,2234.5801,N,11402.9358,E,0.00,154.71,0.30,07,1859464960,24,16598,0,42d48500,LBS:4,460,0,9526,26436,0,9526,26438,108,MCC:9460,0,9526,26436,-94,GSM:1,9460,0,9526,-94"));
    }

    @Test
    public void decodeInitTypeTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        Channel channel = mock(Channel.class);
        ByteBuf byteBuf = Unpooled.wrappedBuffer("[3G*1234567890*0002*INIT]".getBytes(StandardCharsets.US_ASCII));
        decoder.decode(channel, null, byteBuf);
        assertEquals("3G", decoder.getManufacturer());
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void decodeLkTypeTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        Channel channel = mock(Channel.class);
        ByteBuf byteBuf = Unpooled.wrappedBuffer("[3G*1234567890*0002*LK]".getBytes(StandardCharsets.US_ASCII));
        decoder.decode(channel, null, byteBuf);
        assertEquals("3G", decoder.getManufacturer());
        assertTrue(decoder.getHasIndex());
    }

}