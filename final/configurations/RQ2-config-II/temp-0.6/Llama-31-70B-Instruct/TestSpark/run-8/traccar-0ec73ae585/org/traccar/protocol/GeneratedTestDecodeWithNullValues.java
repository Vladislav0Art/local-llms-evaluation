package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTestDecodeWithNullValues {

    private WatchProtocolDecoder protocolDecoder;

    @Test
    public void testDecodeWithNullValues() throws Exception {
        protocolDecoder = new WatchProtocolDecoder(null);
        Object decoded = protocolDecoder.decode(null, null, null);
        Assert.assertNull(decoded);
    }

}