package org.traccar.protocol;

public class GeneratedDecodeGps PositionAndLengthAndHasSatellitesTest {

    @Test
    public void decodeGps

    PositionAndLengthAndHasSatellitesTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        boolean hasSatellites = true;
        assert (Gt06ProtocolDecoder.decodeGps(msg, buf, true, hasSatellites, null, null) == msg);
    }

}