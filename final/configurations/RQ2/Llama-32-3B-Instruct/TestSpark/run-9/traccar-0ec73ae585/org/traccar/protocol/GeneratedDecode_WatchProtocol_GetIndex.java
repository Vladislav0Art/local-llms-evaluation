package org.traccar.protocol;

public class GeneratedDecode_WatchProtocol_GetIndex {

    @Test
    public void decode_WatchProtocol_GetIndex() throws Exception {
        // given
        ByteBuf buf = Unpooled.buffer();
        NetworkMessage message = new NetworkMessage(buf);
        org.traccar.protocol.WatchProtocolDecoder decoder = new org.traccar.protocol.WatchProtocolDecoder(Protocol.WATCH);

        // when
        boolean result = org.traccar.protocol.WatchProtocolDecoder.getHasIndex();

        // then
        assert result == true;
    }

}