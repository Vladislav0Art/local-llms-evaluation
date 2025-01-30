package org.traccar.protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeAlarmPowerCutTest {

    @Test
    public void decodeAlarmPowerCutTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 1 << 14;
        Assert.assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(status));
    }

}