package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndexTrue {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Channel channel;

    @Mock
    private NetworkMessage networkMessage;

    @Test
    public void getHasIndexTrue() {
        when(protocol.getHasIndex()).thenReturn(true);
        assertTrue(WatchProtocolDecoder.class.getMethod("getHasIndex").invoke(null));
    }

}