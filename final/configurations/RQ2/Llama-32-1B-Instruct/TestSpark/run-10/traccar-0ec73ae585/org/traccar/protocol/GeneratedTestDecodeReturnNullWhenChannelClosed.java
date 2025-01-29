package org.traccar.protocol;

public class GeneratedTestDecodeReturnNullWhenChannelClosed {

    private MockWatchProtocolDecoder decoder;

    @Before
    public void setUp() {
        decoder = new MockWatchProtocolDecoder();
    }

    @Test
    public void testDecodeReturnNullWhenChannelClosed() throws Exception {
        // Arrange
        Channel channel = MockChannel.create(1);
        SocketAddress remoteAddress = MockSocketAddress.create(1, 1);

        when(channel.isOpen()).thenReturn(false);
        when(message.getSocketAddress()).thenReturn(remoteAddress);

        // Act and Assert
        Object result = decoder.decode(channel, remoteAddress, null);

        // Assert
        assertNull(result);
    }

    private static class MockWatchProtocolDecoder implements WatchProtocolDecoder {
        @Override
        public boolean getHasIndex() {
            return true;
        }

        @Override
        public String getManufacturer() {
            return "device";
        }

        @Override
        protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
            if (msg instanceof MockDeviceSession && channel.isOpen()) {
                return new MockDeviceSession("device", "test");
            } else {
                return null;
            }
        }
    }

    private static class MockChannel implements Channel {
        @Override
        public boolean isOpen() {
            return true;
        }

        @Override
        public SocketAddress getSocketAddress() {
            return MockSocketAddress.create(1, 1);
        }
    }

    private static class MockSocketAddress implements SocketAddress {
        private final int port;

        public MockSocketAddress(int port) {
            this.port = port;
        }

        @Override
        public int getPort() {
            return port;
        }
    }

    private static class MockDeviceSession implements DeviceSession {
        private String device;

        public MockDeviceSession(String device, String id) {
            this.device = device;
        }

        @Override
        public String getSocketAddress() {
            return "device";
        }

        @Override
        public String getId() {
            return null;
        }
    }

}