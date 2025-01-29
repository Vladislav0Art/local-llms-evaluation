package org.traccar.protocol;

public class GeneratedTest_decodeWithoutData {

    @Test
    public void test_decodeWithoutData() throws Exception {
        ByteBuf bytesBuf = Unpooled.buffer();
        bytesBuf.writeByte(1);
        bytesBuf.writeByte(2);
        Channel channel = null;
        Object msg = decoder.decode(channel, SocketAddress.NULL, bytesBuf);
        assertNull(msg);
    }

}