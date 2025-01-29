package org.traccar.protocol;

public class Generated[MethodUnderTest]

DecodeGt06NetworkMessage {

    @Test
    public void [MethodUnderTest]DecodeGt06NetworkMessage() throws Exception {
        ByteBuf buf = createMockByteBuf(1000);
        Network network = new Network(1, 2, 3);
        Protocol protocol = Gt06ProtocolDecoderDecoded.getProtocol();
        int expectedLength = 6;
        boolean hasLength = true;
        TimeZone timezone = ZoneId.of("GMT");
        byte[] result = Protocol.encodeNetwork(network, buf);
        assert result.length == expectedLength : "[MethodUnderTest]DecodeGt06NetworkMessageTest";
    }

}