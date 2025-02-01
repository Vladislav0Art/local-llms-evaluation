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

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("GalileoProtocolDecoder"));
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8082);

        //buffer to test with the unknown header
        assertEquals(null, decoder.decode(null, remoteAddress, Unpooled.copiedBuffer(new byte[]{(byte) 0xab, (byte) 0xab, (byte) 0xab, (byte) 0xab, (byte) 0xab})));
    }

}