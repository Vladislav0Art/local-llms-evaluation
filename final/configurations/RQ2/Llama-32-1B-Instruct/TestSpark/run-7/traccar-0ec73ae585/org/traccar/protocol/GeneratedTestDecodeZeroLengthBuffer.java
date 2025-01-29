package org.traccar.protocol;

public class GeneratedTestDecodeZeroLengthBuffer {

    @Rule
    public LiveServerStub liveServer = new LiveServerStub("localhost", 8080);

    private Protocol protocol;
    private DeviceSession device;

    @Before
    public void setup() {
        // setup device and protocol
        device = new DeviceSession();
        protocol = new Protocol();
    }

    @Test
    public void testDecodeZeroLengthBuffer() throws Exception {
        // create a byte buffer with zero length
        ByteBuf buffer = Unpooled.buffer(0);

        // set the channel, remote address, and message to decode
        Channel channel = liveServer.getNettyChannel();
        SocketAddress remoteAddress = liveServer.getSocketAddress();

        // assert that the decoded object is as expected
        Position position = (Position) Protocol.decode(channel, remoteAddress, buffer);
    }

}