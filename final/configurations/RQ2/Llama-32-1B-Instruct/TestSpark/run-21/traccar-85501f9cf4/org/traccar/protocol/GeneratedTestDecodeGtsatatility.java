package org.traccar.protocol;

public class GeneratedTestDecodeGtsatatility {

    @Test
    public void testDecodeGtsatatility() throws Exception {
        // Arrange
        byte[] buf = new byte[10];
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        String date = DateBuilder.build(calendar, "2023-02-20T14:30:00");
        ByteBuf timestamp = Unpooled.buffer(10);
        byte[] data = BcdUtil.encode(data, 0x000001);

        // Act
        Protocol protocol = new Protocol();
        return Gt06ProtocolDecoder.decode(buf, SocketAddress.getAny(), position, timestamp, false, false, true, false) == true;
    }

}