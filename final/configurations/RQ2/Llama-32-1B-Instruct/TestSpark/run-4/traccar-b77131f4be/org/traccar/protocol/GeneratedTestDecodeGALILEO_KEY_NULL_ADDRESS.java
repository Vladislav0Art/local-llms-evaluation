package org.traccar.protocol;

import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecodeGALILEO_KEY_NULL_ADDRESS {

    @Test
    public void testDecodeGALILEO_KEY_NULL_ADDRESS() throws Exception {
        Channel channel = Unpooled.buffer(1024).write(null).close();
        SocketAddress remoteAddress = new SocketAddress(Unpooled.buffer(1024).read().getAddress());
        Object decodeResult = new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, null);
        assertEquals(null, (Object) decodeResult);
    }

}