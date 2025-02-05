package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;
import org.traccar.model.Protocol;
import org.traccar.ProtocolDecoder;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void WatchProtocolDecoderNullProtocolTest() {
        Protocol protocol = null;
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        assertNotNull(watchProtocolDecoder);
    }

    @Test
    public void WatchProtocolDecoderDefaultTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        assertNotNull(watchProtocolDecoder);
    }

    @Test
    public void getHasIndexDefaultTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        boolean hasIndex = watchProtocolDecoder.getHasIndex();
        assertTrue(hasIndex);
    }

    @Test
    public void getManufacturerDefaultTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        String manufacturer = watchProtocolDecoder.getManufacturer();
        assertEquals("Unknown", manufacturer);
    }

    @Test
    public void decodeBasicTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Position position = new Position();
        Object result = watchProtocolDecoder.decode(channel, remoteAddress, position);
        assertNotNull(result);
    }

}