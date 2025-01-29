package org.traccar.protocol;

public class Generated[MethodUnderTest]

DecodeGpsPosition {

    @Test
    public void [MethodUnderTest]DecodeGpsPosition() throws Exception {
        ByteBuf buf = createMockByteBuf(1000);
        Position position = new Position(37.7749, -122.4194, 100, true, false);
        Protocol protocol = Gt06ProtocolDecoderDecoded.getProtocol();
        int expectedLength = 13;
        boolean hasLength = true;
        TimeZone timezone = ZoneId.of("GMT");
        boolean hasSatellites = true;
        boolean hasSpeed = false;
        TimeZone expectedTimezone = TimeZone.getTimeZone("America/New_York");

        byte[] result = Gt06ProtocolDecoder.decode(
                Channel.unixChannel(0),
                SocketAddresslocalhost,
                Protocol.encodePosition(position, buf)
        );
        assert result.length == expectedLength : "[MethodUnderTest]DecodeGpsPositionTest";
        assert hasLength : "[MethodUnderTest]DecodeGpsPositionTest";
        assert hasSatellites : "[MethodUnderTest]DecodeGpsPositionTest";
        assert !hasSpeed : "[MethodUnderTest]DecodeGpsPositionTest";
        assert expectedTimezone.equals(timezone) : "[MethodUnderTest]DecodeGpsPositionTest";
    }

}