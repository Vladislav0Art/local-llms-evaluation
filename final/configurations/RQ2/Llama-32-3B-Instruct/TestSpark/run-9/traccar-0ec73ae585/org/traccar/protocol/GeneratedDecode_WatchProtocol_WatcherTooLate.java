package org.traccar.protocol;

public class GeneratedDecode_WatchProtocol_WatcherTooLate {

    @Test
    public void decode_WatchProtocol_WatcherTooLate() throws Exception {
        // given
        ByteBuf buf = Unpooled.buffer();
        NetworkMessage message = new NetworkMessage(buf);
        PatternBuilder watcher = new PatternBuilder();
        watcher.addPattern("Watch Protocol", 1);

        // when
        Object result = org.traccar.protocol.WatchProtocolDecoder.decode(null, null, message);

        // then
        assert result == null;
    }

}