package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTagOtherTest {

    private GalileoProtocolDecoder decoder = spy(new GalileoProtocolDecoder(null));

    @Test
    public void decodeTagOtherTest() {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(1);
        Position position = new Position();
        decoder.decodeTagOther(position, buf, 0x80);
        assertNull(position.getAttributes().get(Position.KEY_VERSION_HW));
    }

}