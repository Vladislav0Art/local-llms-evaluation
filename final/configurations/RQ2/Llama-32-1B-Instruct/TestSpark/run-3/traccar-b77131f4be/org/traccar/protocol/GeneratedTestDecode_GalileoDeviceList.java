package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecode_GalileoDeviceList {

    @Test
    public void testDecode_GalileoDeviceList() {
        // Arrange
        List<SocketAddress> deviceAddresses = new LinkedList<>();
        deviceAddresses.add(new SocketAddress("192.168.1.100:8080"));
        SocketAddress remoteAddress = new SocketAddress("192.168.1.101:8080");

        // Act
        Object result = GalileoProtocolDecoder.decode(deviceAddresses, remoteAddress, null);

        // Assert
        assertTrue(result instanceof List);
    }

}