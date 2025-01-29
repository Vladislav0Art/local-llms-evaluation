package org.traccar.protocol;

public class GeneratedTestPositionDecodeFail {

    public static void main(String[] args) {
        new GalileoProtocolDecoderTest();
    }

    public static class PositionTest extends TestBase {
        @Override
        protected void setUp() throws Exception {
            super.setUp();
        }

        @Test
        public void testPositionDecodeFail() {
            byte[] invalidData = Util.encode(Position.class);
            Channel channel = MockChannel.create();
            DeviceSession session = MockDeviceSession.create(channel, "test");
            Protocol protocol = MockProtocol.create();

            Object result = new GalileoProtocolDecoder(protocol).decode(channel, SocketAddress - Inbound("192.168.0.1", 4444), invalidData);

            assertNull(result);
        }
    }

    public static class NetworkMessageTest extends TestBase {
        @Override
        protected void setUp() throws Exception {
            super.setUp();
        }

    }