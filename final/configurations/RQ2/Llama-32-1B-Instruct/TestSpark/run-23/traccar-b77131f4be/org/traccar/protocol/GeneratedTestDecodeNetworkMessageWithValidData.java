package org.traccar.protocol;

public class GeneratedTestDecodeNetworkMessageWithValidData {

    private Protocol protocol;

    @Before
    public void setup() {
        protocol = new Protocol();
    }

    @Test
    public void testDecodeNetworkMessageWithValidData() throws Exception {
        byte[] data = Unpooled.fromByteArray("1234567890abcdef");
        Channel channel = Channel.unixSocket(12345, true);
        SocketAddress remoteAddress = SocketAddress.fromInetPortNumber(12345);

        NetworkMessage networkMessage = new NetworkMessage();
        BitBuffer bitBuffer = BitUtil.buildBitVector(1);
        bitBuffer.flip();

        Object result = protocol.decode(channel, remoteAddress, data);

        assertNotNull(result);
        assertEquals(networkMessage, (NetworkMessage) result);
    }

}