package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestConstructor {

    private WatchProtocolDecoder protocolDecoder;

    @Test
    public void testConstructor() {
        Protocol protocol = Mockito.mock(Protocol.class);
        protocolDecoder = new WatchProtocolDecoder(protocol);
        Assert.assertNotNull(protocolDecoder);
    }

}