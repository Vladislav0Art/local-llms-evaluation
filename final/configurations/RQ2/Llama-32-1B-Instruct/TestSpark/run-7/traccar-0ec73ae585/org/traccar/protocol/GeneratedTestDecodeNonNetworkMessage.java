package org.traccar.protocol;

public class GeneratedTestDecodeNonNetworkMessage {

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
    public void testDecodeNonNetworkMessage() throws Exception {
        // create a byte buffer with some data
        ByteBuf buffer = Unpooled.buffer(10);

        // set the channel and message to decode
        Channel channel = liveServer.getNettyChannel();
        Object msg = BufferUtil.bytesToMessage(buffer);

        // assert that an exception is thrown
        assertThrows(Exception.class, () -> Protocol.decode(channel, SocketAddress.NO_ADDRESS, msg));
    }

}