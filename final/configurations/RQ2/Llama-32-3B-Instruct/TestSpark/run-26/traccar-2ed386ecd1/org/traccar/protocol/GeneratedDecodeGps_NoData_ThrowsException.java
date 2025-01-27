package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.io.ByteArrayOutputStream;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeGps_NoData_ThrowsException {

    @Test
    public void decodeGps_NoData_ThrowsException() {
        Position position = new Position(new CellTower(), new Network(), new WifiAccessPoint());
        boolean hasLength = false;
        TimeZone timezone = null;
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(0), hasLength, timezone);
        assertTrue(result);
    }

}