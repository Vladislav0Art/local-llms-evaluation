package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecodePositionDateTime {

    @Test
    public void testDecodePositionDateTime() throws Exception {
        // Arrange
        Protocol protocol = mock(Protocol.class);
        String[] args = {"datetime"};
        Position position = new Position(new Calendar.getInstance(), 1643723400, 100000.0);
        SocketAddress address = mock(SocketAddress.class);

        // Act
        Object result = GalileoProtocolDecoder.decode("192.168.1.8", args, address, position);

        // Assert
        assertEquals(position, (Position) result);
    }

}