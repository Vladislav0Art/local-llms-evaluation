package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecode {

    private WatchProtocolDecoder protocolDecoder;

    @Test
    public void testDecode() throws Exception {
        protocolDecoder = new WatchProtocolDecoder(null);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);
        Object decoded = protocolDecoder.decode(channel, remoteAddress, msg);
        Assert.assertNull(decoded);
    }

}