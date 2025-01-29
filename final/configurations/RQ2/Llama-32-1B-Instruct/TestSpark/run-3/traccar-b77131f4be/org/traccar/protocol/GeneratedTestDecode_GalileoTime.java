package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecode_GalileoTime {

    @Test
    public void testDecode_GalileoTime() {
        // Arrange
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));

        // Act
        Object result = GalileoProtocolDecoder.decode(null, null, new ProtocolTimeRequest(calendar));

        // Assert
        assertTrue(result instanceof int);
    }

}