package org.traccar.protocol;

public class GeneratedTestDecodeWatchProtocol_WatchProtocol {

    @Test
    public void testDecodeWatchProtocol_WatchProtocol() throws Exception {
        Channel channel = MockChannel.mockChannel("192.168.1.1:8080");
        SocketAddress remoteAddress = new MockSocketAddress("test_device");

        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        try (MockedChannel mockedChannel = new MockedChannel(channel, remoteAddress)) {
            while (!mockedChannel.isClosed()) {
                String message = mockedChannel.receiveMessage();
                if (Pattern.matches("^[A-Z]+[0-9]+$", message)) {
                    decodedBytes = decoder.decode(mockedChannel, remoteAddress, message);
                    assertEquals("Watch Protocol", decodedBytes.toString());
                }
            }
        }

        Mockito.verify(mockedChannel).isClosed();
    }

}