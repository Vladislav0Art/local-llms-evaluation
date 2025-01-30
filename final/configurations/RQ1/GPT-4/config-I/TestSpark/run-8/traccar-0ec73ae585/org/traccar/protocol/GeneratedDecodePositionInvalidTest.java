package org.traccar.protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePositionInvalidTest {

    @Test
    public void decodePositionInvalidTest() {
        DeviceSession session = new DeviceSession(0, "some-device-id", 0);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        Position position = decoder.decodePosition(session, "invalid data");
        Assert.assertNull(position);
    }

}