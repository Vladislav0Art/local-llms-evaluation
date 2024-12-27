package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedDecodeGpsWithLengthTest {

    @Test
    public void decodeGpsWithLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Position position = new Position();
        ByteBuf buf = Mockito.mock(ByteBuf.class);
        TimeZone timezone = TimeZone.getDefault();

        boolean result = decoder.decodeGps(position, buf, true, timezone);

        assertTrue(result);
    }

}