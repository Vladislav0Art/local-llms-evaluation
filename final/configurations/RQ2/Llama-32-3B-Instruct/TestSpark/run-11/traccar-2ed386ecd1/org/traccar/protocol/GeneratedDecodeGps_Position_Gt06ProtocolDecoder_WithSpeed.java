package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Calendar;

public class GeneratedDecodeGps_Position_Gt06ProtocolDecoder_WithSpeed {

    @Test
    public void decodeGps_Position_Gt06ProtocolDecoder_WithSpeed() {
        Gt06ProtocolDealer decoder = new Gt06ProtocolDealer(Protocol.GT06);
        Position position = new Position(0, 0, 0, 0, 0, null);
        ByteBuffer buf = ByteBuffer.allocate(100);
        buf.put((byte) 'a');
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, true));
    }

}