package org.traccar.protocol;

public class GeneratedDecodeGpsPosition {

    @Test
    public void decodeGpsPosition() throws Exception {
        ByteBuf buf = createMockByteBuf(1000);
        Position position = new Position(37.7749, -122.4194, 100, true, false);
        Protocol protocol = Gt06ProtocolDecoderDecoded.getProtocol();
        int expectedLength = 13;
        boolean hasLength = true;
        TimeZone timezone = ZoneId.of("GMT");
        byte[] result = Protocol.encodePosition(position, buf);
        assert result.length == expectedLength : "[MethodUnderTest]DecodeGpsPositionTest";
        assert hasLength : "[MethodUnderTest]DecodeGpsPositionTest";
        assert hasSatellites() : "[MethodUnderTest]DecodeGpsPositionTest";
    }

    public void decodeGpsPosition(ByteBuf buf) {
        Position position = new Position();
        position.read(buf);
    }

}