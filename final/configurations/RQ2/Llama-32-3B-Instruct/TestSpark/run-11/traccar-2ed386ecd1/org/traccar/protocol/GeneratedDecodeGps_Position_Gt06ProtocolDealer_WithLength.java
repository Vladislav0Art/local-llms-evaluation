package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Calendar;

public class GeneratedDecodeGps_Position_Gt06ProtocolDealer_WithLength {

    @Test
    public void decodeGps_Position_Gt06ProtocolDealer_WithLength() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Position position = new Position(0, 0, 0, 0, 0, null);
        ByteBuffer buf = ByteBuffer.allocate(100);
        buf.put((byte) 'a');
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, null));
    }

}