package org.traccar.protocol;

public class GeneratedTestDecodeWhenNoMessage {

    @Test
    public void testDecodeWhenNoMessage() {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Network network = new Network(UnitsConverter.toCellTower(1, 0));

        decoder.decode(channel, remoteAddress, null);

        verifyNoMoreInteractions(decoder);
    }

    private static class MockWatchProtocolDecoder extends BaseProtocolDecoder {
        @Override
        public boolean getHasIndex() {
            return true;
        }

        @Override
        protected Object decode(
                Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
            return null;
        }
    }

}