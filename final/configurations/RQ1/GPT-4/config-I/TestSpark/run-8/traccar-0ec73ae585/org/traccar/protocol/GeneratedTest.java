package org.traccar.protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void decodeAlarmGeneralTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 0;
        Assert.assertEquals(null, decoder.decodeAlarm(status));
    }

    @Test
    public void decodeAlarmLowBatteryTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 1;
        Assert.assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(status));
    }

    @Test
    public void decodeAlarmGeoExitTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 1 << 1;
        Assert.assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(status));
    }

    @Test
    public void decodeAlarmGeoEnterTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 1 << 2;
        Assert.assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(status));
    }

    @Test
    public void decodeAlarmPowerCutTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 1 << 14;
        Assert.assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(status));
    }

    @Test
    public void decodeAlarmSOSTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 1 << 16;
        Assert.assertEquals(Position.ALARM_SOS, decoder.decodeAlarm(status));
    }

    @Test
    public void decodeAlarmFallDownTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        int status = 1 << 21;
        Assert.assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(status));
    }

    @Test
    public void sendResponseNoIndexTest() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress address = InetSocketAddress.createUnresolved("10.0.0.1", 4088);
        when(channel.remoteAddress()).thenReturn(address);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        decoder.sendResponse(channel, "123456789", null, "test response");

        ArgumentCaptor<NetworkMessage> argument = ArgumentCaptor.forClass(NetworkMessage.class);
        verify(channel).writeAndFlush(argument.capture());

        String data = argument.getValue().getMessage().toString(CharsetUtil.US_ASCII);
        Assert.assertEquals("[test*123456789*000c*test response]", data);
    }

    @Test
    public void decodePositionInvalidTest() {
        DeviceSession session = new DeviceSession(0, "some-device-id", 0);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, true));
        Position position = decoder.decodePosition(session, "invalid data");
        Assert.assertNull(position);
    }

}