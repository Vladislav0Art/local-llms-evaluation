package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGps_ValidParams_ReturnTrue {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @InjectMocks
    private Gt06ProtocolDecoder decoder;

    @Test
    public void decodeGps_ValidParams_ReturnTrue() {
        byte[] buf = new byte[10];
        when(protocol.getBuffer()).thenReturn(buf);
        boolean result = decoder.decodeGps(new Position(), buf, true, true, false, null);
        assertTrue(result);
    }

}