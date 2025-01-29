package org.traccar.protocol;

public class GeneratedTestNetworkMessageDecodeFail {

    public static void main(String[] args) {
        new GalileoProtocolDecoderTest();
    }

    public static class PositionTest extends TestBase {
        @Override
        protected void setUp() throws Exception {
            super.setUp();
        }

        @Test
        public void testNetworkMessageDecodeFail() {
            byte[] invalidData = Util.encode(NetworkMessage.class);
            Channel channel = MockChannel.create();
            Protocol protocol = MockProtocol.create();

            Object result = new GalileoProtocolDecoder(protocol).decode(channel, SocketAddress - Inbound("192.168.0.1", 4445), invalidData);

            assertNull(result);
        }
    }

}