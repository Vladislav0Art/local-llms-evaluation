package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void decodePositionTest() {
        String data = "202202,102022,A,4131.26,N,2343.26,E,7.1,146.86,25.0,3,15,99,959,0,345645,Avg,5,2342,11,145,107,5059,65534,11,1,";
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

        Position result = decoder.decodePosition(new DeviceSession(), data);

        assertEquals("2022-02-20T10:20:22.000+0000", result.getDeviceTime().toString());
        assertTrue(result.getValid());
        assertEquals(41.521, result.getLatitude(), 0.001);
        assertEquals(-23.721, result.getLongitude(), 0.001);
        assertEquals(7.1, result.getSpeed(), 0.001);
        assertEquals(146.86, result.getCourse(), 0.001);
        assertEquals(25.0, result.getAltitude(), 0.001);
    }

    @Test
    public void sendResponseTest() {
        final Channel channel = Mockito.mock(Channel.class);
        String id = "testId";
        String index = "1";
        String content = "content";

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        decoder.sendResponse(channel, id, index, content);

        byte[] expectedResponse = new byte[]{1, 2, 3, 4, 5}; // Your expected response data as byte array
        ByteBuf expectedBuf = Unpooled.wrappedBuffer(expectedResponse);
        verify(channel).writeAndFlush(expectedBuf);
    }

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(1));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(2));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(4));
        assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(16384));
        assertEquals(Position.ALARM_SOS, decoder.decodeAlarm(65536));
        assertEquals(Position.ALARM_REMOVING, decoder.decodeAlarm(1048576));
        assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(2097152));
        assertEquals(null, decoder.decodeAlarm(0));
    }

    @Test
    public void decodeTest() throws Exception {
        final Channel channel = Mockito.mock(Channel.class);
        ByteBuf buf = Mockito.mock(ByteBuf.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        WatchProtocolDecoder decoder = Mockito.spy(new WatchProtocolDecoder(new Protocol("watch")));

        when(buf.readByte()).thenReturn((byte) 1);
        when(buf.readBytes(Mockito.any(ByteBuf.class), Mockito.anyInt())).thenReturn(buf);
        when(buf.toString(Mockito.anyInt(), Mockito.anyInt(), Mockito.any(Charset.class))).thenReturn("test");
        when(buf.readableBytes()).thenReturn(0);

        assertNull(decoder.decode(channel, remoteAddress, buf));

        verify(buf, Mockito.times(5)).skipBytes(Mockito.anyInt());
        verify(buf, Mockito.times(3)).readByte();
        verify(buf, Mockito.times(3)).readBytes(Mockito.any(ByteBuf.class), Mockito.anyInt());
        verify(buf, Mockito.times(2)).toString(Mockito.anyInt(), Mockito.anyInt(), Mockito.any(Charset.class));
    }

}