package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecodeDeviceSession {

    @Test
    public void testDecodeDeviceSession() throws Exception {
        // Arrange
        Protocol protocol = mock(Protocol.class);
        String[] args = {"device1"};
        DeviceSession session = new DeviceSession();
        SocketAddress address = mock(SocketAddress.class);

        // Act
        Object result = GalileoProtocolDecoder.decode("192.168.1.2", args, address, session);

        // Assert
        assertEquals(session, (DeviceSession) result);
    }

}