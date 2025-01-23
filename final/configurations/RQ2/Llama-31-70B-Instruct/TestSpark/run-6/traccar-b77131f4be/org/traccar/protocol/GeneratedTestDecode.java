package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecode {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void testDecode() throws Exception {
        GalileoProtocolDecoder galileoProtocolDecoder = new GalileoProtocolDecoder(new Protocol());
        Object msg = new Object();
        Object result = galileoProtocolDecoder.decode(channel, remoteAddress, msg);
        assertEquals(null, result);
    }

}