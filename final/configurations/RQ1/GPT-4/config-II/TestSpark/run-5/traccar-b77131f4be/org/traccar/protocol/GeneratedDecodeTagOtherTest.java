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

public class GeneratedDecodeTagOtherTest {

    @Test
    public void decodeTagOtherTest() {
        BundleContext context = mock(BundleContext.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gl200"), context);
        ByteBuf buf = Unpooled.buffer();
        buf.writeInt(2000);
        Position position = new Position("dummyProtocol");

        decoder.decodeTagOther(position, buf, 0x44);
        assertEquals(2000, position.get(Position.KEY_ACCELERATION));
    }

}