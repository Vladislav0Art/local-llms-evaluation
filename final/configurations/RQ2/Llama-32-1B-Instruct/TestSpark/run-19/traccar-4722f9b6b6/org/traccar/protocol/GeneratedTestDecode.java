package org.traccar.protocol;

public class GeneratedTestDecode {

    private static final String DEVICE_ID = "1234567890";
    private static final SocketAddress REMOTE_ADDRESS = new SocketAddress("127.0.0.1", 8080);
    private Protocol protocol;
    private Channel channel;

    public void init() throws Exception {
        protocol = new Protocol();
        channel = channel();
    }

    @Test
    public void testDecode() throws Exception {
        Channel channel = channel();
        when(channel.readFrame()).thenReturn(new ByteBuf(10));
        when(channel.writeBytes()).thenReturn(new ByteBuf(20));

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        byte[] bytes = decoder.decode(channel, REMOTE_ADDRESS);
        Assert.assertNotNull(bytes, "Expected decode to return bytes");

        Unpooled bytePool = Unpooled.create();
        BytesConsumableList<Byte> buffer = new BytesConsumableList<>(bytePool);
        decoder.decode(buffer);
        Assert.assertEquals(10, buffer.size(), 0);

        if (bytes != null) {
            byte[] originalBytes = Arrays.copyOf(bytes, bytes.length);
            for (int i = 0; i < bytes.length; i++) {
                byteBuf = Unpooled.ofByte(bytes[i]);
                channel.writeBytes(byteBuf);
            }
        }

        Assert.assertTrue(buffer.isEmpty(), "Expected buffer to be empty");
    }

}