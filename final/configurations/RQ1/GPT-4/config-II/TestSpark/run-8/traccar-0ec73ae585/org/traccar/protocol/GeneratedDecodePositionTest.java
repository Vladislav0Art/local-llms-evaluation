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

public class GeneratedDecodePositionTest {

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

}