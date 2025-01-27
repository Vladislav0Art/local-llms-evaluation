package org.traccar.protocol;

public class GeneratedDecodeGps PositionAndLengthAndHasSatellitesAndHasSpeedTest {

    @Test
    public void decodeGps

    PositionAndLengthAndHasSatellitesAndHasSpeedTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        boolean hasSatellites = true;
        boolean hasSpeed = true;
        assert (Gt06ProtocolDecoder.decodeGps(msg, buf, true, hasSatellites, hasSpeed, null) == msg);
    }

}