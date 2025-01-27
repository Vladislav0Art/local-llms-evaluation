package org.traccar.protocol;

public class GeneratedDecodeGps PositionAndLengthTest {

    @Test
    public void decodeGps

    PositionAndLengthTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        assert (Gt06ProtocolDecoder.decodeGps(msg, buf, true, null, null, null) == msg);
    }

}