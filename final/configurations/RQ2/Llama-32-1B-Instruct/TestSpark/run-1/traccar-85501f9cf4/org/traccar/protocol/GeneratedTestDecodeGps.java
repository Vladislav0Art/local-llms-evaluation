package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodeGps {

    @Test
    public void testDecodeGps() {
        // Arrange
        byte[] data = Mockito.mock(byte[].class);
        Object message = Mockito.mock(Object.class);

        // Act
        BaseProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Position position = new Position();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        TimeZone timezone = Mockito.mock(TimeZone.class);
        Date date = Mockito.mock(Date.class);

        boolean hasLength = Mockito.mock(boolean.class);
        boolean hasSatellites = Mockito.mock(boolean.class);
        boolean hasSpeed = Mockito.mock(boolean.class);
        DateBuilder dateBuilder = new DateBuilder(date, Mockito.mock(TimeZone.class));
        Pattern pattern = new PatternBuilder(PatternUtil.compile("1234"), Mockito.mock(String.class));

        // Assert
        Mockito.when(Protocol.GT06.encodePosition(position)).thenReturn(data);
        Mockito.when(channel.readBytes().equals(data)).thenReturn(true);
        Mockito.when(hasLength).thenReturn(hasSatellites);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        assertTrue(decoder.decode(Gt06ProtocolDecoder.class, position, data, hasLength, hasSatellites, hasSpeed, timezone));
    }

}