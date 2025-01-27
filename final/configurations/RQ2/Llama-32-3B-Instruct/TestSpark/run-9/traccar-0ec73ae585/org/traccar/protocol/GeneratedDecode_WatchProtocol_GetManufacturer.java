package org.traccar.protocol;

public class GeneratedDecode_WatchProtocol_GetManufacturer {

    @Test
    public void decode_WatchProtocol_GetManufacturer() throws Exception {
        // given
        ByteBuf buf = Unpooled.buffer();
        NetworkMessage message = new NetworkMessage(buf);
        org.traccar.protocol.WatchProtocolDecoder decoder = new org.traccar.protocol.WatchProtocolDecoder(Protocol.WATCH);

        // when
        String result = org.traccar.protocol.WatchProtocolDecoder.getManufacturer();

        // then
        assert result == null;
    }

}