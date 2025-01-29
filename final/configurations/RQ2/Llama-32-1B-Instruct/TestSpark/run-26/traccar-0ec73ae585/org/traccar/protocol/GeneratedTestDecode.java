package org.traccar.protocol;

import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;

public class GeneratedTestDecode {

    @Test
    public void testDecode() throws Exception {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        WatchProtocolDecoder protocolDecoder = new WatchProtocolDecoder(protocolDecoder);
        BytesBuffer bytesBuf = BufferUtil.createBytes(10, 1); // 1 byte at index 0
        bytesBuf.putU8(1);
        Protocol protocol = protocolDecoder.decode(bytesBuf, null, null);
        Assert.assertNotNull(protocol);
    }

    public class MockWatchProtocolDecoder extends WatchProtocolDecoder {
        @Override
        protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
            String message = (String) msg;
            Pattern pattern = Pattern.compile("^(\\w+)\\.(\\w+)\\.[\\w]+$");
            Matcher matcher = pattern.matcher(message);
            if (matcher.matches()) {
                return new Position((CellTower) message, Date.now());
            } else {
                return null;
            }
        }

        public MockWatchProtocolDecoder() {
        }
    }

}