package org.traccar.protocol;

public class GeneratedTestGetManufacturerWhenNoMessage {

    @Test
    public void testGetManufacturerWhenNoMessage() {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Network network = new Network(UnitsConverter.toCellTower(1, 0));

        decoder.decode(channel, remoteAddress, null);

        verify(getManufacturer()).string("");
    }

}