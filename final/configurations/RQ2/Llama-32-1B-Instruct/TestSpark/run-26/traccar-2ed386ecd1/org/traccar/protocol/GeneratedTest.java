package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testDecodePosition() {
        Position positionMock = new Position(37.7749, -122.4194); // San Francisco
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(protocol));
        Mockito.when(decoder.decode(channel, remoteAddress, null)).thenReturn(positionMock);
        Mockito.verify(decoder).decode(Position.class, channel, remoteAddress, Position.class);
    }

    @Test
    public void testDecodePositionNoLength() {
        Position position = new Position(37.7749, -122.4194); // San Francisco
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(protocol));
        Mockito.when(decoder.decode(channel, remoteAddress, null)).thenReturn(position);
        Mockito.verify(decoder).decode(Position.class, channel, remoteAddress, Position.class);
    }

    @Test
    public void testDecodePositionNoSatellites() {
        Position position = new Position(37.7749, -122.4194); // San Francisco
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(protocol));
        Mockito.when(decoder.decode(channel, remoteAddress, null)).thenReturn(position);
        Mockito.verify(decoder).decode(Position.class, channel, remoteAddress, Position.class);
    }

    @Test
    public void testDecodePositionNoSpeed() {
        Position position = new Position(37.7749, -122.4194); // San Francisco
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(protocol));
        Mockito.when(decoder.decode(channel, remoteAddress, null)).thenReturn(position);
        Mockito.verify(decoder).decode(Position.class, channel, remoteAddress, Position.class);
    }

    @Test
    public void testDecodePositionNoTimestamp() {
        Position position = new Position(37.7749, -122.4194); // San Francisco
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(protocol));
        Mockito.when(decoder.decode(channel, remoteAddress, null)).thenReturn(position);
        Mockito.verify(decoder).decode(Position.class, channel, remoteAddress, Position.class);
    }

    @Test
    public void testDecodePositionNoTimezone() {
        Position position = new Position(37.7749, -122.4194); // San Francisco
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(protocol));
        Mockito.when(decoder.decode(channel, remoteAddress, null)).thenReturn(position);
        Mockito.verify(decoder).decode(Position.class, channel, remoteAddress, Position.class);
    }

    @Test
    public void testDecodePositionNoAltitude() {
        Position position = new Position(37.7749, -122.4194); // San Francisco
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(protocol));
        Mockito.when(decoder.decode(channel, remoteAddress, null)).thenReturn(position);
        Mockito.verify(decoder).decode(Position.class, channel, remoteAddress, Position.class);
    }

    @Test
    public void testDecodePositionNoDeviceSession() {
        Position position = new Position(37.7749, -122.4194); // San Francisco
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(protocol));
        Mockito.when(decoder.decode(channel, remoteAddress, null)).thenReturn(position);
        Mockito.verify(decoder).decode(Position.class, channel, remoteAddress, Position.class);
    }

    @Test
    public void testDecodePositionNoError() {
        Position position = new Position(37.7749, -122.4194); // San Francisco
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol(protocol));
        Mockito.when(decoder.decode(channel, remoteAddress, null)).thenReturn(position);
        Mockito.verify(decoder).decode(Position.class, channel, remoteAddress, Position.class);
    }

}