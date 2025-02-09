package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeEmptyMessageTest {

    @Test
    public void decodeEmptyMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("galileo"));
        EmbeddedChannel channel = new EmbeddedChannel(decoder);

        channel.writeInbound(Unpooled.copiedBuffer("?,,?", StandardCharsets.US_ASCII));
        Object message = channel.readInbound();

        assertNotNull(message);
        assertEquals(List.class, message.getClass());

        List<Position> positions = (List<Position>) message;
        assertEquals(0, positions.size());
    }

}