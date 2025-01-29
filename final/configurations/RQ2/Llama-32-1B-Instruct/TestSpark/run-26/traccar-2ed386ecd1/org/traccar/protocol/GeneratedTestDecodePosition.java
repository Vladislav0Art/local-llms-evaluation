package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() {
        Position positionMock = new Position(37.7749, -122.4194); // San Francisco
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(protocol));
        Mockito.when(decoder.decode(channel, remoteAddress, null)).thenReturn(positionMock);
        Mockito.verify(decoder).decode(Position.class, channel, remoteAddress, Position.class);
    }

}