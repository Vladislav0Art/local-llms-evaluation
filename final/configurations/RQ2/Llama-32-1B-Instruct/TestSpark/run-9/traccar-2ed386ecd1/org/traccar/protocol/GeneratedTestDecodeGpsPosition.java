package org.traccar.protocol;

public class GeneratedTestDecodeGpsPosition {

    @Test
    public void testDecodeGpsPosition() {
        ByteBuf buf = Unpooled.buffer(10);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");
        // ...

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, false, false, false, null);

        assertEquals(10, buf.readUnsignedInt());
        assertEquals("37.7749", new String(buf.readLine().getBytes(), StandardCharsets.UTF_8));
        assertEquals("-122.4194", new String(buf.readLine().getBytes(), StandardCharsets.UTF_8));
    }

}