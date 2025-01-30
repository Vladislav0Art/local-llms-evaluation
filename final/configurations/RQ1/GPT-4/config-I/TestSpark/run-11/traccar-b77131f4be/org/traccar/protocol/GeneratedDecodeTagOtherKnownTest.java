package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.Protocol;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTagOtherKnownTest {

    @Test
    public void decodeTagOtherKnownTest() {
        ByteBuf buf = mock(ByteBuf.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("test"));
        Position position = new Position();

        decoder.decodeTagOther(position, buf, 0x10);
        assertEquals(null, position.getAttributes().get(Position.KEY_INDEX));
    }

}