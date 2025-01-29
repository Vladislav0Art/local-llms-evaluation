package org.traccar.protocol;

import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.protocol.Position;

public class GeneratedTestDecodeGps {

    public static Position decodeGps(ByteBuf buf) throws Exception {
        return Gt06ProtocolDecoder.decodePosition(buf);
    }
}

class Gt06ProtocolDecoderTest {

    @Test
    public void testDecodeGps() {
        Position position = new Position(37.7749, -122.4194);
        byte[] bytes = PublicClass.encode(position);
        Object result = PublicClass.decodeGps(ByteBuf.wrap(bytes));
        assertEquals(3, ((Position) result).getLatitude().getLatitudeBits());
    }

}