package org.traccar.protocol;

public class GeneratedDecode_WatchRequest_WithLocation_ReturnsCorrectPosition {

    @Test
    public void decode_WatchRequest_WithLocation_ReturnsCorrectPosition() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Position position = Position.builder()
                .latitude(37.7749)
                .longitude(-122.4194)
                .altitude(10)
                .heightAboveSeaLevel(5)
                .speed(25)
                .course(270)
                .accuracy(1)
                .timestamp(new Date())
                .build();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = decoder.decode(channel, remoteAddress, position);
        assertNotNull(msg);
        assertTrue(BufferUtil.containsBytes((ByteBuf) msg, BufferUtil.encodePosition(37.7749, -122.4194, 10)));
    }

}