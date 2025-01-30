package org.traccar.protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeAlarmSOSTest {

    @Test
    public void decodeAlarmSOSTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 1 << 16;
        Assert.assertEquals(Position.ALARM_SOS, decoder.decodeAlarm(status));
    }

}