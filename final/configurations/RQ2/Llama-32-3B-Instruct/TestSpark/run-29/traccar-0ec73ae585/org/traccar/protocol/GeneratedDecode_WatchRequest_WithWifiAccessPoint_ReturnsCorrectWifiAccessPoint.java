package org.traccar.protocol;

public class GeneratedDecode_WatchRequest_WithWifiAccessPoint_ReturnsCorrectWifiAccessPoint {

    @Test
    public void decode_WatchRequest_WithWifiAccessPoint_ReturnsCorrectWifiAccessPoint() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        WifiAccessPoint wifiAccessPoint = WifiAccessPoint.builder()
                .mac("111")
                .signalStrength(-50)
                .timestamp(new Date())
                .build();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = decoder.decode(channel, remoteAddress, wifiAccessPoint);
        assertNotNull(msg);
        assertTrue(BufferUtil.containsBytes((ByteBuf) msg, BufferUtil.encodeWifiAccessPoint("111", -50)));
    }

}