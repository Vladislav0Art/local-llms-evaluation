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

public class GeneratedDecodeWithNullChannelTest {

    @Test
    public void DecodeWithNullChannelTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("galileo"));
        Object message = decoder.decode(null, null, Unpooled.copiedBuffer("?test,data?", StandardCharsets.US_ASCII));

        assertNotNull(message);
        assertEquals(List.class, message.getClass());

        List<Position> positions = (List<Position>) message;
        assertEquals(1, positions.size());
    }

}