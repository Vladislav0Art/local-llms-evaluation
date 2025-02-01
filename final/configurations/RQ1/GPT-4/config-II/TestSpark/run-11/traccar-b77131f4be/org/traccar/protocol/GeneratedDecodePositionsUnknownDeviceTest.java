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

public class GeneratedDecodePositionsUnknownDeviceTest {

    @Test
    public void decodePositionsUnknownDeviceTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("GalileoProtocolDecoder"));
        Position position = new Position("protocol");
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8082);
        assertEquals(null, decoder.decodePositions(null, remoteAddress, Unpooled.copiedBuffer(new byte[]{
                (byte) 0x00, (byte) 0x07, (byte) 0x66, (byte) 0x01, (byte) 0x03, (byte) 0x00, (byte) 0x00})));
    }

}