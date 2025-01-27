package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetManufacturer {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Object msg;

    @Test
    public void testGetManufacturer() {
        when(WatchProtocolDecoder.getProtocol()).thenReturn("Watch Protocol");
        assertEquals("Watch Protocol", WatchProtocolDecoder.getManufacturer());
    }

}