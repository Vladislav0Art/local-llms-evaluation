package org.traccar.protocol;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestDecodeWithBufferAndSocketAddress {

    private Protocol protocol;

    @Before
    public void setUp() {
        protocol = new Protocol();
    }

    @After
    public void tearDown() {
        protocol = null;
    }

    @Test
    public void testDecodeWithBufferAndSocketAddress() throws Exception {
        Channel channel = Unpooled.buffer(1000, "Hello".getBytes(StandardCharsets.UTF_8));
        SocketAddress remoteAddress = AddressUtils.createSocketAddress("127.0.0.1:8080");
        MockWatchProtocolDecoder mockWatchProtocolDecoder = new MockWatchProtocolDecoder(protocol);
        Network network = parseChannel(channel, remoteAddress, mockWatchProtocolDecoder);
        assertNotNull(network);
    }

    private Network parseChannel(Channel channel, SocketAddress remoteAddress, MockWatchProtocolDecoder mockWatchProtocolDecoder) throws Exception {
        Buffer buffer = Unpooled.buffer(1000, "Hello".getBytes(StandardCharsets.UTF_8));
        Object msg = decode(channel, remoteAddress, buffer);
        return (Network) msg;
    }

    private byte[] parseBuffer(Buffer buffer) throws Exception {
        Parser parser = new Parser(buffer);
        return parser.parse();
    }
}

class MockWatchProtocolDecoder extends WatchProtocolDecoder {
    public MockWatchProtocolDecoder(Protocol protocol) {
        super(protocol);
    }

}