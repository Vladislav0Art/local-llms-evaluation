package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void testDecodeGps() {
        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getDefault();
        assertTrue(gt06ProtocolDecoder.decodeGps(position, buf, hasLength, timezone));
    }

    @Test
    public void testDecodeGpsWithSatellites() {
        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        boolean hasLength = true;
        boolean hasSatellites = true;
        boolean hasSpeed = true;
        TimeZone timezone = TimeZone.getDefault();
        assertTrue(gt06ProtocolDecoder.decodeGps(position, buf, hasLength, hasSatellites, hasSpeed, timezone));
    }

    @Test
    public void testDecode() throws Exception {
        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = new Object();
        assertTrue(gt06ProtocolDecoder.decode(channel, remoteAddress, msg) != null);
    }

}