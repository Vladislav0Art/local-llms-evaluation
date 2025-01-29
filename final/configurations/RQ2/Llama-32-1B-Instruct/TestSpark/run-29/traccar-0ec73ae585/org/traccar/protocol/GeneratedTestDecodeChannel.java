package org.traccar.protocol;

public class GeneratedTestDecodeChannel {

    @Test
    public void testDecodeChannel() throws Exception {
        Channel channel = createChannel(0, 0, 1);
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertNotNull(decoder.decode(channel, null));
    }

}