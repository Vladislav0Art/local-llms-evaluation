package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeTagTest {

    @Test
    public void decodeTagTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gl200"));
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01);
        Position position = new Position("dummyProtocol");

        decoder.decodeTag(position, buf, 0x01);
        assertEquals(1, position.get(Position.KEY_VERSION_HW));
    }

}