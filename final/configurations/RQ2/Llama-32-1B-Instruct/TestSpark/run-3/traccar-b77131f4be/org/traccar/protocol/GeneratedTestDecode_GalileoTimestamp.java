package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecode_GalileoTimestamp {

    @Test
    public void testDecode_GalileoTimestamp() {
        // Arrange
        Date date = new Date();

        // Act
        Object result = GalileoProtocolDecoder.decode(null, null, new ProtocolTimestampRequest(date));

        // Assert
        assertTrue(result instanceof long);
    }

}