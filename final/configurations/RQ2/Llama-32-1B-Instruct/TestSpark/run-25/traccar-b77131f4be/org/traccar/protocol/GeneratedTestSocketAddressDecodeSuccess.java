package org.traccar.protocol;

public class GeneratedTestSocketAddressDecodeSuccess {

    public static void main(String[] args) {
        new GalileoProtocolDecoderTest();
    }

    public static class PositionTest extends TestBase {
        @Override
        protected void setUp() throws Exception {
            super.setUp();
        }

        @Test
        public void testSocketAddressDecodeSuccess() {
            byte[] data = Util.encode(SocketAddress.class);
            Channel channel = MockChannel.create();
            Protocol protocol = MockProtocol.create();

            Object result = new GalileoProtocolDecoder(protocol).decode(channel, SocketAddress - Inbound("192.168.0.1", 4444), data);

            assertEquals(SocketAddress.class, ((SocketAddress) result));
        }

    }