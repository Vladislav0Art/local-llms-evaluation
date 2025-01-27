package org.traccar.protocol;

public class GeneratedDecodeGpsDecodeFailureWithSatellitesAndSpeedTest {

    @Test
    public void decodeGpsDecodeFailureWithSatellitesAndSpeedTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        boolean hasSatellites = false;
        boolean hasSpeed = false;
        assert (!Gt06ProtocolDecoder.decodeGps(msg, buf, true, hasSatellites, hasSpeed, null));
    }

}