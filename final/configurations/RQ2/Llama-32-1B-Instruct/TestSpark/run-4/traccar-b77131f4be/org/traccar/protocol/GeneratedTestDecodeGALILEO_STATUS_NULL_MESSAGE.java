package org.traccar.protocol;

import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecodeGALILEO_STATUS_NULL_MESSAGE {

    @Test
    public void testDecodeGALILEO_STATUS_NULL_MESSAGE() throws Exception {
        Channel channel = Unpooled.buffer(1024).write("invalid message".getBytes(StandardCharsets.UTF_8)).close();
        SocketAddress remoteAddress = new SocketAddress(Unpooled.buffer(1024).read().getAddress());
        Object decodeResult = new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, null);
        assertEquals(null, (Object) decodeResult);
    }

}