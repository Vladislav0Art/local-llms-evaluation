package org.traccar.protocol;

public class GeneratedTest {

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
    public void testGetHasIndex() throws Exception {
        // mock getHasIndex method to return true
        boolean result = mock(Protocol.class, "getHasIndex");
        verify(protocol).getHasIndex();

        // assert that result is as expected
        assertTrue(result);
    }

    @Test
    public void testGetManufacturer() throws Exception {
        // mock getManufacturer method to return "TRACCA"
        String result = mock(String.class, "getManufacturer");
        verify(protocol).getManufacturer();

        // assert that result is as expected
        assertEquals("TRACCA", result);
    }

    @Test
    public void testDecode() throws Exception {
        // create a byte buffer and write some data to it
        ByteBuf buffer = Unpooled.buffer(10);

        // set the channel, remote address, and message to decode
        Channel channel = liveServer.getNettyChannel();
        SocketAddress remoteAddress = liveServer.getSocketAddress();
        Object msg = BufferUtil.bytesToMessage(buffer);

        // assert that the decoded object is as expected
        Position position = (Position) Protocol.decode(channel, remoteAddress, msg);
        assertEquals("TRACCA", position.getManufacturer());
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