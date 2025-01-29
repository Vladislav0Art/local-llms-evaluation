package org.traccar.protocol;

import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecode_GalileoTimeRange {

    @Test
    public void testDecode_GalileoTimeRange() {
        // Arrange
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        calendar.add(Calendar.YEAR, 1);

        // Act
        Object result = GalileoProtocolDecoder.decode(null, null, new ProtocolTimeRequest(calendar));

        // Assert
        assertTrue(result instanceof int);
    }

}