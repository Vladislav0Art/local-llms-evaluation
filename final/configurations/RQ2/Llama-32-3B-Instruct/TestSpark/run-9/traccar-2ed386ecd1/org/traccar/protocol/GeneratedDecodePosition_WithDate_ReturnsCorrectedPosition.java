package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodePosition_WithDate_ReturnsCorrectedPosition {

    @Test
    public void decodePosition_WithDate_ReturnsCorrectedPosition() {
        ByteBuf buf = Unpooled.buffer(4);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        assertEquals(calendar.getTimeZone(), Gt06ProtocolDecoder.decodeGps(new Position(), buf, true, false, false, null));
    }

}