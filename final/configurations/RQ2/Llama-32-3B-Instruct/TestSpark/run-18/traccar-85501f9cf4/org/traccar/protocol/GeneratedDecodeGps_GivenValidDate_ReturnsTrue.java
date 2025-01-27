package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_GivenValidDate_ReturnsTrue {

    @Test
    public void decodeGps_GivenValidDate_ReturnsTrue() {
        Calendar calendar = Calendar.getInstance();
        Date date = DateBuilder.build(calendar);
        assertTrue(Gt06ProtocolDecoder.decodeGps(new Position(), Unpooled.copiedBuffer(1, 2), true, null));
    }

}