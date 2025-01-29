package org.traccar.protocol;

public class GeneratedTestDecode {

    private Protocol protocol;

    @Before
    public void setUp() {
        protocol = new Protocol();
    }

    @Test
    public void testDecode() throws Exception {
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
    public WatchProtocolDecoder(Protocol protocol) {
        super(protocol);
    }

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
        return parseBuffer((byte[]) msg);
    }

}