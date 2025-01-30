package org.traccar.protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeAlarmGeneralTest {

    @Test
    public void decodeAlarmGeneralTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 0;
        Assert.assertEquals(null, decoder.decodeAlarm(status));
    }

}