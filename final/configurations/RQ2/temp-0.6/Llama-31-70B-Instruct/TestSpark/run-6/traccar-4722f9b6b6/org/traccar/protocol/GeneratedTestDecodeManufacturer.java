package org.traccar.protocol;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecodeManufacturer {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress socketAddress;

    private WatchProtocolDecoder decoder;

    @Before
    public void setup() {
        decoder = new WatchProtocolDecoder(mock(Protocol.class));
    }

    @Test
    public void testDecodeManufacturer() {
        assertEquals("Watch", decoder.getManufacturer());
    }

}