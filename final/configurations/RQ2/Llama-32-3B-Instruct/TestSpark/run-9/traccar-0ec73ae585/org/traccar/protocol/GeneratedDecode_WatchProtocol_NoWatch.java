package org.traccar.protocol;

public class GeneratedDecode_WatchProtocol_NoWatch {

    @Test
    public void decode_WatchProtocol_NoWatch() throws Exception {
        // given
        ByteBuf buf = Unpooled.buffer();
        NetworkMessage message = new NetworkMessage(buf);

        // when
        Object result = org.traccar.protocol.WatchProtocolDecoder.decode(null, null, message);

        // then
        assert result == null;
    }

}