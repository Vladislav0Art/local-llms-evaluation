package org.traccar.protocol;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.traccar.BaseTest;
import org.traccar.model.Position;

public class GeneratedTest {

    @Mock
    private Channel channel;
    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void testDecodeMethod() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        MockitoAnnotations.initMocks(this);

        Object msg = "test message";
        when(channel.attr(any()).get()).thenReturn(null);

        Object result = decoder.decode(channel, remoteAddress, msg);

        assertNotNull(result);
    }

}