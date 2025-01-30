package org.traccar.protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeAlarmGeoEnterTest {

    @Test
    public void decodeAlarmGeoEnterTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 1 << 2;
        Assert.assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(status));
    }

}