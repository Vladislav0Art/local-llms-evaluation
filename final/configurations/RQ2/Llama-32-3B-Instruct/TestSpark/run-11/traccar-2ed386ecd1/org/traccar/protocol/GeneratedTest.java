package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Calendar;

public class GeneratedTest {

    @Test
    public void decodeGps_Position_Gt06ProtocolDecoder() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Position position = new Position(0, 0, 0, 0, 0, null);
        ByteBuffer buf = ByteBuffer.allocate(100);
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, null));
    }

    @Test
    public void decodeGps_Position_Gt06ProtocolDecoder_WithLength() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Position position = new Position(0, 0, 0, 0, 0, null);
        ByteBuffer buf = ByteBuffer.allocate(100);
        buf.put((byte) 'a');
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, null));
    }

    @Test
    public void decodeGps_Position_Gt06ProtocolDecoder_WithSatellites() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDealer(Protocol.GT06);
        Position position = new Position(0, 0, 0, 0, 0, null);
        ByteBuffer buf = ByteBuffer.allocate(100);
        buf.put((byte) 'a');
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, true));
    }

    @Test
    public void decodeGps_Position_Gt06ProtocolDecoder_WithSpeed() {
        Gt06ProtocolDealer decoder = new Gt06ProtocolDealer(Protocol.GT06);
        Position position = new Position(0, 0, 0, 0, 0, null);
        ByteBuffer buf = ByteBuffer.allocate(100);
        buf.put((byte) 'a');
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, true));
    }

    @Test
    public void decodeGps_Position_Gt06ProtocolDealer() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Position position = new Position(0, 0, 0, 0, 0, null);
        ByteBuffer buf = ByteBuffer.allocate(100);
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, null));
    }

    @Test
    public void decodeGps_Position_Gt06ProtocolDealer_WithLength() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Position position = new Position(0, 0, 0, 0, 0, null);
        ByteBuffer buf = ByteBuffer.allocate(100);
        buf.put((byte) 'a');
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, null));
    }

    @Test
    public void decodeGps_Position_Gt06ProtocolDealer_WithSatellites() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Position position = new Position(0, 0, 0, 0, 0, null);
        ByteBuffer buf = ByteBuffer.allocate(100);
        buf.put((byte) 'a');
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, true));
    }

    @Test
    public void decodeGps_Position_Gt06ProtocolDealer_WithSpeed() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Position position = new Position(0, 0, 0, 0, 0, null);
        ByteBuffer buf = ByteBuffer.allocate(100);
        buf.put((byte) 'a');
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, true));
    }
}

public class Gt06ProtocolDealer extends Gt06ProtocolDecoder {

    @Override
    protected Object decode(
            Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
        ByteBuffer buf = (ByteBuffer) msg;
        return super.decode(
                channel, remoteAddress, new Object[]{buf});
    }
}

@Test
public void testDecode() {
    Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    assertEquals("expected", decoder.decode(
            Channel.getChannel(), SocketAddress.getSocketAddress(),
            "message"));
}

@Test
public void decodeChannel() {
    Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
    assertNotNull(decoder.decode(
            Channel.getChannel(), SocketAddress.getSocketAddress(),
            null));
}

}