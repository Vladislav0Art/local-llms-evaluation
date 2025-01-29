package org.traccar.protocol;

public class GeneratedTestDecodeMessageWithUnsupportedProtocol {

    @Test
    public void testDecodeMessageWithUnsupportedProtocol() throws Exception {
        // Arrange
        Channel channel = MockChannel();
        SocketAddress remoteAddress = MockSocketAddress();
        Object msg = new Object();
        Protocol protocol = new UnsupportedProtocol();

        // Act and Assert
        decoder.decode(channel, remoteAddress, msg);
    }

    private class MockChannel implements Channel {
        @Override
        public void close() {
        }
    }

    private class MockSocketAddress implements SocketAddress {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MockSocketAddress that = (MockSocketAddress) o;
            return Objects.equals(remoteAddress, that.remoteAddress);
        }

        @Override
        public int hashCode() {
            return Objects.hash(remoteAddress);
        }
    }

    private class MockMsg implements Object {
        @Override
        public byte[] bytes() {
            return new byte[0];
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MockMsg that = (MockMsg) o;
            return Objects.equals(msg, that.msg);
        }
    }

    private class Protocol {
        public String getManufacturer() { /* implementation */ }

        @Override
        protected Object decode(
                Channel channel, SocketAddress remoteAddress, Object msg) throws Exception { /* implementation */ }
    }

    private class UnsupportedProtocol extends BaseProtocolDecoder {
    }

}