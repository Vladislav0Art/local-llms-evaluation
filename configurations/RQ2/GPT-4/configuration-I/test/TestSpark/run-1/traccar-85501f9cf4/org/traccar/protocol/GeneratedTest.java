package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.traccar.Protocol;

public class GeneratedTest {

    @Test
    public void decodeGpsPositionNullTest() {
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(null, buf, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsBufferNullTest() {
        Position position = new Position();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, null, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsPositionAndBufferNotNullTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer().writeBytes("XYZ".getBytes(StandardCharsets.UTF_8));
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsExtendedPositionNullTest() {
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(null, buf, true, true, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsExtendedBufferNullTest() {
        Position position = new Position();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, null, true, true, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsExtendedPositionAndBufferNotNullTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer().writeBytes("XYZ".getBytes(StandardCharsets.UTF_8));
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeObjectMsgNullTest() throws Exception {
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertFalse((boolean) decoder.decode(null, remoteAddress, null));
    }

    @Test
    public void decodeObjectValidMsgTest() throws Exception {
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertTrue((boolean) decoder.decode(null, remoteAddress, "Valid Message"));
    }

}