package org.traccar.protocol;

public class GeneratedDecodeGt06NetworkMessage {

    @Test
    public void decodeGt06NetworkMessage() throws Exception {
        ByteBuf buf = createMockByteBuf(1000);
        String message = "Hello, World!";
        Protocol protocol = Gt06ProtocolDecoderDecoded.getProtocol();
        int expectedLength = 24;
        boolean hasLength = true;
        TimeZone timezone = ZoneId.of("GMT");
        byte[] result = protocol.decodeMessage(message, buf);
        assert result.length == expectedLength : "[MethodUnderTest]DecodeGt06NetworkMessageTest";
        assert hasLength : "[MethodUnderTest]DecodeGt06NetworkMessageTest";
    }

    public void decodeGt06NetworkMessage(ByteBuf buf) {
        String message = "Hello, World!";
        Protocol protocol = Gt06ProtocolDecoderDecoded.getProtocol();
        int expectedLength = 24;
        boolean hasLength = true;
        TimeZone timezone = ZoneId.of("GMT");
        byte[] result = protocol.decodeMessage(message, buf);
        assert result.length == expectedLength : "[MethodUnderTest]DecodeGt06NetworkMessageTest";
        assert hasLength : "[MethodUnderTest]DecodeGt06NetworkMessageTest";
    }

}