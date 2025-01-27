package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Calendar;

public class GeneratedDecodeGps_Position_Gt06ProtocolDealer_WithSpeed {

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

}