package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.mockito.Mockito.*;

import org.traccar.Protocol;

import static org.junit.Assert.*;

import java.net.SocketAddress;

public class GeneratedTest {

    @Test
    public void constructorNormalScenarioTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        assertNotNull(decoder);
    }

    @Test
    public void getHasIndexNormalScenarioTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        boolean result = decoder.getHasIndex();

        assertNotNull(result);
    }

    @Test
    public void getManufacturerNormalScenarioTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        String result = decoder.getManufacturer();

        assertNotNull(result);
    }

    @Test
    public void decodeNullChannelNullAddressNullMessageTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        decoder.decode(null, null, null);
    }

    @Test
    public void decodeValidScenarioTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        SocketAddress localSocketAddress = mock(SocketAddress.class);
        String msg = "testMessage";

        try {
            decoder.decode(null, localSocketAddress, msg);
        } catch (Exception e) {
            fail("No exception should have been thrown");
        }
    }

}