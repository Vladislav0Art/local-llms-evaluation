package org.traccar.protocol;

public class Generated[MethodUnderTest]

DecodeGt06WifiAccessPoint {

    @Test
    public void [MethodUnderTest]DecodeGt06WifiAccessPoint() throws Exception {
        WifiAccessPoint wifiAccessPoint = new WifiAccessPoint(1, 2, 3);
        Protocol protocol = Gt06ProtocolDecoderDecoded.getProtocol();
        int expectedLength = 6;
        boolean hasLength = true;
        TimeZone timezone = ZoneId.of("GMT");
        byte[] result = Protocol.encodeWifiAccessPoint(wifiAccessPoint, buf);
        assert result.length == expectedLength : "[MethodUnderTest]DecodeGt06WifiAccessPointTest";
    }

    private ByteBuf createMockByteBuf ( int length){
        ByteBuf buffer = Unpooled.buffer();
        for (int i = 0; i < length; i++) {
            buffer.writeByte(i % 256);
        }
        return buffer;
    }

}