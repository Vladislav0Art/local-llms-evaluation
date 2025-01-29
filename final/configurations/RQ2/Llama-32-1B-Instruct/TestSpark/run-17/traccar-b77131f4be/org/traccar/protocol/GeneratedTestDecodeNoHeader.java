package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTestDecodeNoHeader {

    @Test
    public void testDecodeNoHeader() {
        Channel channel = Unpooled.buffer().writeBytes("{\"data\":{\"latitude\":37.7749,\"longitude\":-122.4194,\"accuracy\":2}}");
        byte[] bytes = channel.readUntil(new PacketReader(), new byte[]{0x00, 0x00});
        Object decodedMessage = decode(bytes);
    }

}