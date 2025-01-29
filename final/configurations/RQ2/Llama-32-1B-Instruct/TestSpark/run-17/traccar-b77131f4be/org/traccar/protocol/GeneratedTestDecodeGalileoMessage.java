package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTestDecodeGalileoMessage {

    @Test
    public void testDecodeGalileoMessage() {
        String message = "{\"header\":{\"timestamp\":1643723400,\"type\":\"galileo\"},\"data\":{\"latitude\":37.7749,\"longitude\":-122.4194,\"accuracy\":2}}";
        Channel channel = Unpooled.buffer().writeBytes(message.getBytes(StandardCharsets.UTF_8));
        byte[] bytes = channel.readUntil(new PacketReader(), new byte[]{0x00, 0x00});
        Object decodedMessage = decode(bytes);
        assertNotNull(decodedMessage);
    }

}