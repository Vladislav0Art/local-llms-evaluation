package org.traccar.protocol;

public class GeneratedTest_decodeWithIndex {

    @Test
    public void test_decodeWithIndex() throws Exception {
        ByteBuf bytesBuf = Unpooled.buffer();
        bytesBuf.writeByte(1);
        bytesBuf.writeByte(2);
        Channel channel = null;
        Object msg = decoder.decode(channel, SocketAddress.NULL, bytesBuf);
        assertNotNull(msg);
        assertEquals(1, ((Integer) msg).getValue());
    }

}