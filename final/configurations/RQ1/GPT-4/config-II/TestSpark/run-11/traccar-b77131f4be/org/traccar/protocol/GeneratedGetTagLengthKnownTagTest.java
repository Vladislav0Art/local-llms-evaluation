package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetTagLengthKnownTagTest {

    @Test
    public void getTagLengthKnownTagTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("GalileoProtocolDecoder"));
        assertEquals(2, decoder.getTagLength(0x60));
    }

}