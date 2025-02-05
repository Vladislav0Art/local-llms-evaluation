package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        String testMessage = "testMessage";
        ByteBuf buf = Unpooled.copiedBuffer(testMessage, StandardCharsets.US_ASCII);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watchProtocolTest", 0));

        Position result = (Position) decoder.decode(null, null, buf.toString(StandardCharsets.US_ASCII));

        assertNotNull(result);
        assertEquals(result.getProtocol(), "watchProtocolTest");
        assertEquals(result.getDeviceId(), testMessage);
    }

}