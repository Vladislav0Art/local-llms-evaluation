package org.traccar.protocol;

public class GeneratedTestDecodeWifiAccessPoint {

    private Protocol protocol;
    private Channel channel;
    private SocketAddress remoteAddress;

    @Before
    public void setUp() {
        // No setup needed for this test
    }

    @Test
    public void testDecodeWifiAccessPoint() throws Exception {
        WifiAccessPoint wifiAccessPoint = mock(WifiAccessPoint.class);

        TestWatchProtocolDecoder decoder = new TestWatchProtocolDecoder(protocol);
        decoder.setChannel(new Channel());
        decoder.setRemoteAddress(remoteAddress);
        decoder.setMessage("Hello, World!");
        decoder.setCellTower(cellTower);
        decoder.setPosition(position);
        decoder.setWifiAccessPoint(wifiAccessPoint);

        Result result = decoder.decode(null, null, msg);

        verify(channel).write((ByteBuf.class)wifiAccessPoint);
        verify(remoteAddress).equals(remoteAddress);
    }

}