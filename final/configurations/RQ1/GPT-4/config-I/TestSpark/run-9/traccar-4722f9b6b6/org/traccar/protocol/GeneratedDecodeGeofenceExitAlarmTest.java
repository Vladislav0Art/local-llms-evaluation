package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeGeofenceExitAlarmTest {

    @Test
    public void decodeGeofenceExitAlarmTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        ByteBuf buf = Unpooled.copiedBuffer("[3G*1234567890*00A5*UD,210917,203130,A,52.09830,N,4.35200,E,0.00,0.0,1.0,6,0,67,101,0,0,00000011,1,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,]", StandardCharsets.US_ASCII);
        Position position = (Position) decoder.decode(null, null, buf);
        assertEquals(position.get(Position.KEY_ALARM), Position.ALARM_GEOFENCE_EXIT);
    }

}