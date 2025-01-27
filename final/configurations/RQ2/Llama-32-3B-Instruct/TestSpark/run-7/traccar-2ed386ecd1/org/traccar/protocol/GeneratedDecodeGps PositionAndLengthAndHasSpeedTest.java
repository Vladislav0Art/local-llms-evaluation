package org.traccar.protocol;

public class GeneratedDecodeGps PositionAndLengthAndHasSpeedTest {

    @Test
    public void decodeGps

    PositionAndLengthAndHasSpeedTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        boolean hasSpeed = true;
        assert (Gt06ProtocolDecoder.decodeGps(msg, buf, true, null, hasSpeed, null) == msg);
    }

}