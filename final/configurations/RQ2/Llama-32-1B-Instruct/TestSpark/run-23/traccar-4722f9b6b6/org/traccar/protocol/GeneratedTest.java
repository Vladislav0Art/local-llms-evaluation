package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void [MethodUnderTest]

    DecodeWatchProtocolChannel() {
        MockChannel channel = new MockChannel();
        MockRemoteAddress remoteAddress = new MockRemoteAddress("192.168.1.100");
        MockMessage message = new MockMessage();
        when(channel.accept()).thenReturn(message);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Object result = decoder.decode(channel, remoteAddress, message);

        assertEquals("[CellTower]", result.getClass().getName());
    }

    @Test
    public void [MethodUnderTest]

    DecodeWatchProtocolCell() {
        MockChannel channel = new MockChannel();
        MockRemoteAddress remoteAddress = new MockRemoteAddress("192.168.1.100");
        MockMessage message = new MockMessage();
        when(channel.accept()).thenReturn(message);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Object result = decoder.decode(channel, remoteAddress, message);

        assertEquals("[CellTower]", result.getClass().getName());
    }

    @Test
    public void [MethodUnderTest]

    DecodeWatchProtocolPosition() {
        MockChannel channel = new MockChannel();
        MockRemoteAddress remoteAddress = new MockRemoteAddress("192.168.1.100");
        MockMessage message = new MockMessage();
        when(channel.accept()).thenReturn(message);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Object result = decoder.decode(channel, remoteAddress, message);

        assertEquals("[Position]", result.getClass().getName());
    }

    @Test
    public void [MethodUnderTest]

    DecodeWatchProtocolCellTower() {
        MockChannel channel = new MockChannel();
        MockRemoteAddress remoteAddress = new MockRemoteAddress("192.168.1.100");
        MockMessage message = new MockMessage();
        when(channel.accept()).thenReturn(message);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Object result = decoder.decode(channel, remoteAddress, message);

        assertEquals("[CellTower]", result.getClass().getName());
    }

    @Test
    public void [MethodUnderTest]

    DecodeWatchProtocolMessage() {
        MockChannel channel = new MockChannel();
        MockRemoteAddress remoteAddress = new MockRemoteAddress("192.168.1.100");
        MockMessage message = new MockMessage();
        when(channel.accept()).thenReturn(message);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Object result = decoder.decode(channel, remoteAddress, message);

        assertEquals("[Position]", result.getClass().getName());
    }

    @Test
    public void [MethodUnderTest]

    DecodeWatchProtocolCellTowerMessage() {
        MockChannel channel = new MockChannel();
        MockRemoteAddress remoteAddress = new MockRemoteAddress("192.168.1.100");
        MockMessage message = new MockMessage();
        when(channel.accept()).thenReturn(message);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Object result = decoder.decode(channel, remoteAddress, message);

        assertEquals("[CellTower]", result.getClass().getName());
    }

    @Test
    public void [MethodUnderTest]

    DecodeWatchProtocolManufacturer() {
        MockChannel channel = new MockChannel();
        MockRemoteAddress remoteAddress = new MockRemoteAddress("192.168.1.100");
        MockMessage message = new MockMessage();
        when(channel.accept()).thenReturn(message);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Object result = decoder.decode(channel, remoteAddress, message);

        assertEquals("[Manufacturer]", result.getClass().getName());
    }

    @Test
    public void [MethodUnderTest]

    DecodeWatchProtocolDecoded() {
        MockChannel channel = new MockChannel();
        MockRemoteAddress remoteAddress = new MockRemoteAddress("192.168.1.100");
        MockMessage message = new MockMessage();
        when(channel.accept()).thenReturn(message);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Object result = decoder.decode(channel, remoteAddress, message);

        assertEquals("[Position]", result.getClass().getName());
    }

    @Test
    public void [MethodUnderTest]

    DecodeWatchProtocolInvalidMessage() {
        MockChannel channel = new MockChannel();
        MockRemoteAddress remoteAddress = new MockRemoteAddress("192.168.1.100");
        MockMessage message = null;
        when(channel.accept()).thenReturn(message);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Object result = decoder.decode(channel, remoteAddress, message);

        assertEquals("[CellTower]", result.getClass().getName());
    }

    private static class MockChannel {
        public Channel accept() throws Exception {
            return null;
        }
    }

    private static class MockRemoteAddress {
        private String value;

        public MockRemoteAddress(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    private static class MockMessage implements NetworkMessage {
        @Override
        public Object getType() {
            return null;
        }

        @Override
        public byte[] getContentBytes() {
            return null;
        }

        @Override
        public SocketAddress getRemoteAddress() {
            return null;
        }

        @Override
        public int getMessageId() {
            return 0;
        }
    }

    private static class MockProtocol implements Protocol {
        public String getProtocol() {
            return "WATCH_PROTOCOL";
        }
    }

}