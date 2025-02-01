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

public class GeneratedDecodeTagUnknownTagTest {

    @Test
    public void decodeTagUnknownTagTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("GalileoProtocolDecoder"));
        Position position = new Position("protocol");
        decoder.decodeTag(position, Unpooled.copiedBuffer(new byte[]{(byte) 0xab, (byte) 0xab}), 0xab);
        assertTrue(position.getAttributes().isEmpty());
    }

}