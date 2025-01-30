package org.traccar.protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeAlarmLowBatteryTest {

    @Test
    public void decodeAlarmLowBatteryTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 1;
        Assert.assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(status));
    }

}