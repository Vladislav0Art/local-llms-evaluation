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

public class GeneratedDecodePositionTest {

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

}