package org.traccar.protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeAlarmGeoExitTest {

    @Test
    public void decodeAlarmGeoExitTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 1 << 1;
        Assert.assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(status));
    }

}