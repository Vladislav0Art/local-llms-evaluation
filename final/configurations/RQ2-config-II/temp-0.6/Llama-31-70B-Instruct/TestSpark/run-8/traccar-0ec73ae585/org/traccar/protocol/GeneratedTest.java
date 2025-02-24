package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTest {

    private WatchProtocolDecoder protocolDecoder;

    @Test
    public void testConstructor() {
        Protocol protocol = Mockito.mock(Protocol.class);
        protocolDecoder = new WatchProtocolDecoder(protocol);
        Assert.assertNotNull(protocolDecoder);
    }

    @Test
    public void testGetHasIndex() {
        protocolDecoder = new WatchProtocolDecoder(null);
        boolean hasIndex = protocolDecoder.getHasIndex();
        Assert.assertFalse(hasIndex);
    }

    @Test
    public void testGetManufacturer() {
        protocolDecoder = new WatchProtocolDecoder(null);
        String manufacturer = protocolDecoder.getManufacturer();
        Assert.assertNull(manufacturer);
    }

    @Test
    public void testDecode() throws Exception {
        protocolDecoder = new WatchProtocolDecoder(null);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);
        Object decoded = protocolDecoder.decode(channel, remoteAddress, msg);
        Assert.assertNull(decoded);
    }

    @Test
    public void testDecodeWithNullValues() throws Exception {
        protocolDecoder = new WatchProtocolDecoder(null);
        Object decoded = protocolDecoder.decode(null, null, null);
        Assert.assertNull(decoded);
    }

}