package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.mockito.Mockito.*;

import org.traccar.Protocol;

import static org.junit.Assert.*;

import java.net.SocketAddress;

public class GeneratedDecodeNullChannelNullAddressNullMessageTest {

    @Test
    public void decodeNullChannelNullAddressNullMessageTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        decoder.decode(null, null, null);
    }

}