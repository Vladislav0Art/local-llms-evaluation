package org.traccar.protocol;

import org.junit.Test;
import org.traccar.session.DeviceSession;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodePositionTest {

    private final Protocol protocol = new Protocol("watch");
    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

    @Test
    public void decodePositionTest() {
        DeviceSession deviceSession = new DeviceSession(1l);
        String data = "140921,072854,A,-22.917528,S,113.914008,E,12.12,321.3,0.000,12.0,31,81,32,0," +
                "0x13f00000,2,20,1,460,0,9,5111," +
                "60286,109,4,wifi1,34:FC:B9:D1:97:75,-96|wifi2,88:25:93:31:80:E8,-99|wifi3,DC:FE:07:79:29:A8,-100";
        Position position = decoder.decodePosition(deviceSession, data);
        assertEquals(deviceSession.getDeviceId(), position.getDeviceId());
        assertEquals(113.914008, position.getLongitude(), 0.0);
        assertEquals(-22.917528, position.getLatitude(), 0.0);
        assertEquals(Position.ALARM_GEOFENCE_EXIT, position.get(Position.KEY_ALARM));
    }

}