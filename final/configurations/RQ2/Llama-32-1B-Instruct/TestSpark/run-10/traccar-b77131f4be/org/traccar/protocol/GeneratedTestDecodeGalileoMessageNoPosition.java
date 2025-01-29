package org.traccar.protocol;

public class GeneratedTestDecodeGalileoMessageNoPosition {

    @Test
    public void testDecodeGalileoMessageNoPosition() {
        String[] expected = {"12345", "67890"};
        byte[] inputBuffer = Unpooled.buffer(4);
        new NetworkMessage(inputBuffer, null, null).encode(inputBuffer);
        Object actual = decodeGalileoProtocolDecoder(inputBuffer, null, null);
        assertEquals(expected[0], ((String) actual).split(":")[1].toCharArray());
        assertEquals(expected[1], ((String) actual).split(":")[0]);
    }

    private byte[] encodePosition(Position position, Unpooled unpooled) {
        StringBuilder sb = new StringBuilder();
        for (char c : position.getTimes()) {
            sb.append(c);
        }
        return ByteBufUtil.serialize(sb.toString(), 4);
    }

    private Object decodeGalileoProtocolDecoder(byte[] inputBuffer, SocketAddress remoteAddress, Object msg) throws Exception {
        byte[] position = new Position(0, 1).encode(inputBuffer);
        byte[] session = new DeviceSession(position, remoteAddress, msg).encode(inputBuffer);
        return ByteBufUtil.deserialize(session, null, null);
    }

}