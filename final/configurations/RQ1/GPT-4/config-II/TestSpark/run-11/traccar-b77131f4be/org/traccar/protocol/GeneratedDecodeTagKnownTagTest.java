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

public class GeneratedDecodeTagKnownTagTest {

    @Test
    public void decodeTagKnownTagTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("GalileoProtocolDecoder"));
        Position position = new Position("protocol");
        decoder.decodeTag(position, Unpooled.copiedBuffer(new byte[]{(byte) 0x00, (byte) 0x01}), 0x01);
        assertTrue(position.getAttributes().containsKey(Position.KEY_VERSION_HW));
    }

}