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
public class GeneratedDecodeGps_TimezoneNull_ReturnException {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @InjectMocks
    private Gt06ProtocolDecoder decoder;

    @Test
    public void decodeGps_TimezoneNull_ReturnException() {
        byte[] buf = Mockito.mock(byte[].class);
        when(protocol.getBuffer()).thenReturn(buf);
        Exception exception = assertThrows(Exception.class, () -> decoder.decodeGps(new Position(), buf, true, true, false, null));
        assertNotNull(exception.getMessage());
    }

}