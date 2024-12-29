package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertTrue(decoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals("Traccar", decoder.getManufacturer());
    }

    @Test
    public void testDecodeWatchProtocol() throws Exception {
        Channel channel = MockChannel.mockChannel("192.168.1.1:8080");
        SocketAddress remoteAddress = MockSocketAddress.create("test_device");

        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        try (MockedChannel mockedChannel = new MockedChannel(channel, remoteAddress)) {
            while (!mockedChannel.isClosed()) {
                String message = mockedChannel.receiveMessage();
                if (Pattern.matches("^[A-Z]+[0-9]+$", message)) {
                    decodedBytes = decoder.decode(mockedChannel, remoteAddress);
                    assertEquals("Watch Protocol", decodedBytes.toString());
                }
            }
        }

        Mockito.verify(mockedChannel).isClosed();
    }

    public static class MockChannel extends Channel {
        private final boolean closed;

        public MockChannel(NettyByteBuf channel, SocketAddress remoteAddress) {
            super(Unpooled.buffer());
            this.closed = false;
        }

        @Override
        public void close() {
            closed = true;
        }

        @Override
        public void finish() {
            closed = false;
        }

        @Override
        public boolean isClosed() {
            return closed;
        }
    }

    public static class MockSocketAddress extends SocketAddress {
        private final String address;

        public MockSocketAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return address;
        }

        public static MockSocketAddress create(String address) {
            return new MockSocketAddress(address);
        }
    }

    public static class MockMessage {
        public String data;

        public MockMessage(String data) {
            this.data = data;
        }
    }

}