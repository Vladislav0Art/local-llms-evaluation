package org.traccar.protocol;

public class GeneratedTestDecodeGpsPosition {

    @Test
    public void testDecodeGpsPosition() {
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Unpooled.buffer();
        // Assuming BcdUtil.encode() returns a byte array representing the GPS position
        byte[] gpsBytes = BcdUtil.encode(position);
        String expected = "37.7749,-122.4194";
        assertTrue(decodeGpsPosition(buf, gpsBytes, false, null, null, TimeZone.getTimeZone()));
    }

}