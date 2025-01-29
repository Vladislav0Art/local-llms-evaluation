package org.traccar.protocol;

public class GeneratedDecodeGt06CellTower {

    @Test
    public void decodeGt06CellTower() throws Exception {
        ByteBuf buf = createMockByteBuf(1000);
        String message = "Hello, World!";
        Protocol protocol = Gt06ProtocolDecoderDecoded.getProtocol();
        int expectedLength = 24;
        boolean hasLength = true;
        TimeZone timezone = ZoneId.of("GMT");
        byte[] result = protocol.decodeCellTower(message, buf);
        assert result.length == expectedLength : "[MethodUnderTest]DecodeGt06CellTowerTest";
        assert hasLength : "[MethodUnderTest]DecodeGt06CellTowerTest";
    }

    public void decodeGt06CellTower(ByteBuf buf) {
        String message = "Hello, World!";
        Protocol protocol = Gt06ProtocolDecoderDecoded.getProtocol();
        int expectedLength = 24;
        boolean hasLength = true;
        TimeZone timezone = ZoneId.of("GMT");
        byte[] result = protocol.decodeCellTower(message, buf);
        assert result.length == expectedLength : "[MethodUnderTest]DecodeGt06CellTowerTest";
        assert hasLength : "[MethodUnderTest]DecodeGt06CellTowerTest";
    }

}