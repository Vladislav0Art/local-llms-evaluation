package org.traccar.protocol;

public class GeneratedDecodeGpsDecodeFailureWithLengthTest {

    @Test
    public void decodeGpsDecodeFailureWithLengthTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        boolean hasLength = false;
        assert (!Gt06ProtocolDecoder.decodeGps(msg, buf, hasLength, null, null, null));
    }

}