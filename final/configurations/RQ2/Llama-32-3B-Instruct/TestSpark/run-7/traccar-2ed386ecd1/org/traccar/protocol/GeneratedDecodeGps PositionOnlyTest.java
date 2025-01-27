package org.traccar.protocol;

public class GeneratedDecodeGps PositionOnlyTest {

    @Test
    public void decodeGps

    PositionOnlyTest() {
        Object msg = new Position(37, -122);
        assert (Gt06ProtocolDecoder.decodeGps(null, null, true, null, null, null) == msg);
    }

}