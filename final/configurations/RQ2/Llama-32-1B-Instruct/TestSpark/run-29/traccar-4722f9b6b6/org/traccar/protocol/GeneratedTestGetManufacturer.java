package org.traccar.protocol;

public class GeneratedTestGetManufacturer {

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

}