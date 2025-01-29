package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Network network = new Network(UnitsConverter.toCellTower(1, 0));
        Position position = new Position(new Date(), 10.5, 34.7, -118.4);
        WifiAccessPoint accessPoint = new WifiAccessPoint(new SocketAddress("192.168.1.2"), "wpa", new byte[]{});

        NetworkMessage msg = new NetworkMessage(
                Protocol.WatchProtocol,
                Arrays.asList(position),
                Arrays.asList(accessPoint)
        );

        decoder.decode(channel, remoteAddress, msg);

        verify(getHasIndex()).booleanValue(true);
    }

    @Test
    public void testGetManufacturer() {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Network network = new Network(UnitsConverter.toCellTower(1, 0));
        Position position = new Position(new Date(), 10.5, 34.7, -118.4);
        WifiAccessPoint accessPoint = new WifiAccessPoint(new SocketAddress("192.168.1.2"), "wpa", new byte[]{});

        NetworkMessage msg = new NetworkMessage(
                Protocol.WatchProtocol,
                Arrays.asList(position),
                Arrays.asList(accessPoint)
        );

        decoder.decode(channel, remoteAddress, msg);

        verify(getManufacturer()).string("Test");
    }

    @Test
    public void testDecode() {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Network network = new Network(UnitsConverter.toCellTower(1, 0));
        Position position = new Position(new Date(), 10.5, 34.7, -118.4);
        WifiAccessPoint accessPoint = new WifiAccessPoint(new SocketAddress("192.168.1.2"), "wpa", new byte[]{});

        NetworkMessage msg = new NetworkMessage(
                Protocol.WatchProtocol,
                Arrays.asList(position),
                Arrays.asList(accessPoint)
        );

        decoder.decode(channel, remoteAddress, msg);

        verify(getDecode(), times(1)).decode(channel, remoteAddress, msg);
    }

    @Test
    public void testGetHasIndexWhenNoMessage() {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Network network = new Network(UnitsConverter.toCellTower(1, 0));

        decoder.decode(channel, remoteAddress, null);

        verify(getHasIndex()).booleanValue(false);
    }

    @Test
    public void testGetManufacturerWhenNoMessage() {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Network network = new Network(UnitsConverter.toCellTower(1, 0));

        decoder.decode(channel, remoteAddress, null);

        verify(getManufacturer()).string("");
    }

    @Test
    public void testDecodeWhenNoMessage() {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Network network = new Network(UnitsConverter.toCellTower(1, 0));

        decoder.decode(channel, remoteAddress, null);

        verifyNoMoreInteractions(decoder);
    }

    private static class MockWatchProtocolDecoder extends BaseProtocolDecoder {
        @Override
        public boolean getHasIndex() {
            return true;
        }

        @Override
        protected Object decode(
                Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
            return null;
        }
    }

}