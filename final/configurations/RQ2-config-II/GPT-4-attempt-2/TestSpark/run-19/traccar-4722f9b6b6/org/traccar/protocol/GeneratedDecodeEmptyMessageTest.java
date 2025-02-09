package org.traccar.protocol;

import org.traccar.Protocol;
import org.traccar.model.Position;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.InetSocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeEmptyMessageTest {

    @Mock
    private Protocol protocol;

    @Test
    public void decodeEmptyMessageTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        InetSocketAddress address = new InetSocketAddress(123456);
        assertNull(decoder.decode(null, address, ""));
    }

}