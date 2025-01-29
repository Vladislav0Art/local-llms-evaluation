package org.traccar.protocol;

import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecodeGALILEO_KEY {

    @Test
    public void testDecodeGALILEO_KEY() throws Exception {
        NetworkMessage msg = new NetworkMessage(GALILEO_KEY, null);
        Channel channel = Unpooled.buffer(1024).write(msg.getBytes(StandardCharsets.UTF_8)).close();
        SocketAddress remoteAddress = new SocketAddress(Unpooled.buffer(1024).read().getAddress());
        Object decodeResult = new GalileoProtocolDecoder(new Protocol()).decode(channel, remoteAddress, msg);
        assertEquals(GALILEO_KEY, (Object) decodeResult);
    }

}