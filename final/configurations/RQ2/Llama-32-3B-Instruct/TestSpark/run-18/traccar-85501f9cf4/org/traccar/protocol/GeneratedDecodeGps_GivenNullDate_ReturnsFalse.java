package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_GivenNullDate_ReturnsFalse {

    @Test
    public void decodeGps_GivenNullDate_ReturnsFalse() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 12);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);
        assertTrue(!Gt06ProtocolDecoder.decodeGps(null, Unpooled.copiedBuffer(1, 2), true, null));
    }

}