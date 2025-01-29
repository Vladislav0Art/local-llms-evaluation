package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecodeUnitsConverter {

    @Test
    public void testDecodeUnitsConverter() throws Exception {
        // Arrange
        Protocol protocol = mock(Protocol.class);
        String[] args = {"converter"};
        UnitsConverter unitsConverter = new UnitsConverter();
        SocketAddress address = mock(SocketAddress.class);

        // Act
        Object result = GalileoProtocolDecoder.decode("192.168.1.7", args, address, unitsConverter);

        // Assert
        assertEquals(unitsConverter.toString(), (String) result);
    }

}