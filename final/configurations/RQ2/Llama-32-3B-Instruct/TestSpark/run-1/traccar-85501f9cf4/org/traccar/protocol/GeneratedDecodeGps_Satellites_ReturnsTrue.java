package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Map;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import org.traccar.helper.Checksum;
import org.traccar.model.Position;
import org.traccar.model.CellTower;

public class GeneratedDecodeGps_Satellites_ReturnsTrue {

    @Test
    public void decodeGps_Satellites_ReturnsTrue() {
        Position position = new Position();
        position.setLatitude(52.5200);
        position.setLongitude(13.4050);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = DateBuilder.buildDate(calendar, 2022, 1, 1);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.copiedBuffer(4), true, null, false, calendar.getTime());
        assertTrue(result);
    }

}