package org.traccar.protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeAlarmFallDownTest {

    @Test
    public void decodeAlarmFallDownTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 1 << 21;
        Assert.assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(status));
    }

}