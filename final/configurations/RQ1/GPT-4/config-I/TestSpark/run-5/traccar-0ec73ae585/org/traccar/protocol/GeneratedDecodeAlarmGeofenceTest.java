package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTester;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class GeneratedDecodeAlarmGeofenceTest {

    @Test
    public void decodeAlarmGeofenceTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());

        Position position = decoder.decode(null, null, "[3G*2000000867*0019*LK,070417,A,2500.10756,N,12134.255610,E,000.00,200,0075,1++]");

        assertEquals(25.0017627, position.getLatitude(), 0.01);
        assertEquals(121.571594, position.getLongitude(), 0.01);
        assertEquals(75, position.getValid() ? 1 : 0);
        assertEquals("Geo-fence alarm", position.getAttributes().get(Position.KEY_ALARM));
    }

}