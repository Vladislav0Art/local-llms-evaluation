package org.traccar.protocol;

import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecodeNotSupportedMessage {

    @Test
    public void testDecodeNotSupportedMessage() throws Exception {
        Channel channel = Unpooled.buffer(1024).write("unsupported message".getBytes(StandardCharsets.UTF_8)).close();
        SocketAddress remoteAddress = new SocketAddress(Unpooled.buffer(1024).read().getAddress());
        Object decodeResult = new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, "unsupported message");
        assertEquals(null, (Object) decodeResult);
    }

}