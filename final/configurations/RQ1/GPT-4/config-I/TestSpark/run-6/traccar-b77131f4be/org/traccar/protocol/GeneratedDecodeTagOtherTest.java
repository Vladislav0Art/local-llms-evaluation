package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeTagOtherTest {

    @Test
    public void decodeTagOtherTest() {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(64);
        buf.writeShortLE(5678);

        Position position = new Position("test");

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());

        decoder.decodeTagOther(position, buf, buf.getByte(0));

        assertEquals(5678, (int) position.getAttributes().get(Position.KEY_STATUS));
    }

}