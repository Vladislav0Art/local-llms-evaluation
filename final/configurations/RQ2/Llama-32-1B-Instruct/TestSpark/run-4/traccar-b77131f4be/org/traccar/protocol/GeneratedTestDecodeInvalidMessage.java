package org.traccar.protocol;

import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecodeInvalidMessage {

    @Test
    public void testDecodeInvalidMessage() throws Exception {
        Channel channel = Unpooled.buffer(1024).write("invalid message".getBytes(StandardCharsets.UTF_8)).close();
        SocketAddress remoteAddress = new SocketAddress(Unpooled.buffer(1024).read().getAddress());
        Object decodeResult = new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, "invalid message");
        assertEquals(null, (Object) decodeResult);
    }

}