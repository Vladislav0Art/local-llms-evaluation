package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void decodeGps

    PositionOnlyTest() {
        Object msg = new Position(37, -122);
        assert (Gt06ProtocolDecoder.decodeGps(null, null, true, null, null, null) == msg);
    }

    @Test
    public void decodeGps

    PositionAndLengthTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        assert (Gt06ProtocolDecoder.decodeGps(msg, buf, true, null, null, null) == msg);
    }

    @Test
    public void decodeGps

    PositionAndLengthAndHasSatellitesTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        boolean hasSatellites = true;
        assert (Gt06ProtocolDecoder.decodeGps(msg, buf, true, hasSatellites, null, null) == msg);
    }

    @Test
    public void decodeGps

    PositionAndLengthAndHasSpeedTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        boolean hasSpeed = true;
        assert (Gt06ProtocolDecoder.decodeGps(msg, buf, true, null, hasSpeed, null) == msg);
    }

    @Test
    public void decodeGps

    PositionAndLengthAndHasSatellitesAndHasSpeedTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        boolean hasSatellites = true;
        boolean hasSpeed = true;
        assert (Gt06ProtocolDecoder.decodeGps(msg, buf, true, hasSatellites, hasSpeed, null) == msg);
    }

    @Test
    public void decodeGps

    DecodeFailureTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        assert (!Gt06ProtocolDecoder.decodeGps(msg, buf, true, null, null, null));
    }

    @Test
    public void decodeGpsDecodeFailureWithLengthTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        boolean hasLength = false;
        assert (!Gt06ProtocolDecoder.decodeGps(msg, buf, hasLength, null, null, null));
    }

    @Test
    public void decodeGpsDecodeFailureWithSatellitesAndSpeedTest() {
        Object msg = new Position(37, -122);
        ByteBuf buf = Unpooled.buffer();
        boolean hasSatellites = false;
        boolean hasSpeed = false;
        assert (!Gt06ProtocolDecoder.decodeGps(msg, buf, true, hasSatellites, hasSpeed, null));
    }

    @Test
    public void decode

    DecodeTest() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = new Gt06ProtocolDecoder(Protocol.GT06).new Object();
        assert (Gt06ProtocolDecoder.decode(channel, remoteAddress, msg) == null);
    }

    @Test
    public void decodeDecodeSuccessfulTest() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = new Gt06ProtocolDecoder(Protocol.GT06).new Object();
        byte[] data = {1, 2, 3};
        ByteBuf buf = Unpooled.buffer(data);
        assert (Gt06ProtocolDecoder.decode(channel, remoteAddress, msg) == null);
    }

}