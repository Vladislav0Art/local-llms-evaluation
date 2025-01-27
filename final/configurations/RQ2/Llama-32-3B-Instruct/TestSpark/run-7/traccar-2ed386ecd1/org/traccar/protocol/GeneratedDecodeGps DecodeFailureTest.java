package org.traccar.protocol;

public class GeneratedDecodeGps DecodeFailureTest {

    @Test
    public void decodeGps

    DecodeFailureTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        assert (!Gt06ProtocolDecoder.decodeGps(msg, buf, true, null, null, null));
    }

}