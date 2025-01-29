package org.traccar.protocol;

public class GeneratedTestDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezoneAndChecksumAndLengthAndTimestampAndLongitudeAndLatitudeAndAltitude {

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezoneAndChecksumAndLengthAndTimestampAndLongitudeAndLatitudeAndAltitude() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

}