package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.util.TimeZone;

public class GeneratedDecodeGpsHasNoLengthAndNoTimezoneTest {

    @Test
    public void decodeGpsHasNoLengthAndNoTimezoneTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        byte[] bytes = {0x00, 0x00, 0x00};
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        Assert.assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, null));
    }

}