package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecode_GalileoPosition {

    @Test
    public void testDecode_GalileoPosition() {
        // Arrange
        Position position = new Position("latitude", "longitude");
        SocketAddress remoteAddress = new SocketAddress("192.168.1.100:8080");

        // Act
        Object result = GalileoProtocolDecoder.decode(position, remoteAddress, null);

        // Assert
        assertEquals(1234, (int) result);
    }

}