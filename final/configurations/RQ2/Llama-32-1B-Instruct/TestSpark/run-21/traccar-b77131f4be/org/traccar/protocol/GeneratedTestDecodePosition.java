package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() throws Exception {
        // Arrange
        Protocol protocol = mock(Protocol.class);
        String[] args = {"1", "2"};
        DeviceSession session = new DeviceSession();
        Position position = new Position(new Calendar.getInstance(), 1643723400, 100000.0);

        // Act
        Object result = GalileoProtocolDecoder.decode("192.168.1.1", args, mock(SocketAddress.class), position);

        // Assert
        assertEquals(position, (Position) result);
    }

}