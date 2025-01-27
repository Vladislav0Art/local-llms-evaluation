package org.traccar.protocol;

public class GeneratedDecode_WatchProtocol_DecodeComplete {

    @Test
    public void decode_WatchProtocol_DecodeComplete() throws Exception {
        // given
        ByteBuf buf = Unpooled.buffer();
        NetworkMessage message = new NetworkMessage(buf);
        Pattern pattern = PatternBuilder.createPattern("Watch Protocol");
        PatternBuilder watcher = new PatternBuilder();
        watcher.addPattern(pattern, 1);

        // when
        Object result = org.traccar.protocol.WatchProtocolDecoder.decode(null, null, message);

        // then
        assert result != null;
    }

}