package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithSpeed {

    @Test
    public void testDecodeGpsWithSpeed() {
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Unpooled.buffer();
        // Assuming BcdUtil.encode() returns a byte array representing the GPS position with speed
        byte[] gpsBytes = BcdUtil.encode(position);
        String expected = "37.7749,-122.4194";
        assertTrue(decodeGps(buf, gpsBytes, false, null, true, TimeZone.getTimeZone()));
    }

}