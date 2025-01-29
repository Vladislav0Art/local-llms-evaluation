package org.traccar.protocol;

public class GeneratedTestDecodeNetworkSocketChannelSocket {

    @Test
    public void testDecodeNetworkSocketChannelSocket() throws Exception {
        Network network = new Network(new Position(1, 2), new CellTower("tower"), new WifiAccessPoint("ap"));
        String expectedMessage = "watches: 1";
        Object message = decode(Unpooled.buffer().socketChannels(), SocketAddress.IN, expectedMessage);
        assertEquals(expectedMessage, message.toString());
    }

}