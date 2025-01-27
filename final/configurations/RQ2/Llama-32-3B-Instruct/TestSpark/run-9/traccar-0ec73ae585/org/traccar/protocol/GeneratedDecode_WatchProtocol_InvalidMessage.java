package org.traccar.protocol;

public class GeneratedDecode_WatchProtocol_InvalidMessage {

    @Test
    public void decode_WatchProtocol_InvalidMessage() throws Exception {
        // given
        ByteBuf buf = Unpooled.buffer();
        NetworkMessage message = new NetworkMessage(buf);
        PatternBuilder watcher = new PatternBuilder();

        // when
        Object result = org.traccar.protocol.WatchProtocolDecoder.decode(null, null, message);

        // then
        assert result == null;
    }

}