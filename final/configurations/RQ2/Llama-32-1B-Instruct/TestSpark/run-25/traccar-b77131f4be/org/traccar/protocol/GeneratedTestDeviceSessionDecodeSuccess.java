package org.traccar.protocol;

public class GeneratedTestDeviceSessionDecodeSuccess {

    public static void main(String[] args) {
        new GalileoProtocolDecoderTest();
    }

    public static class PositionTest extends TestBase {
        @Override
        protected void setUp() throws Exception {
            super.setUp();
        }

        @Test
        public void testDeviceSessionDecodeSuccess() {
            byte[] data = Util.encode(DeviceSession.class);
            Channel channel = MockChannel.create();
            Protocol protocol = MockProtocol.create();

            Object result = new GalileoProtocolDecoder(protocol).decode(channel, SocketAddress - Inbound("192.168.0.1", 4444), data);

            assertEquals(DeviceSession.class, ((DeviceSession) result));
        }

    }