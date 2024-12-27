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
public class GeneratedDecodeGps_LengthNotAvailable_ReturnFalse {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @InjectMocks
    private Gt06ProtocolDecoder decoder;

    @Test
    public void decodeGps_LengthNotAvailable_ReturnFalse() {
        byte[] buf = Mockito.mock(byte[].class);
        when(protocol.getBuffer()).thenReturn(buf);
        assertFalse(decoder.decodeGps(new Position(), Mockito.mock(ByteBuf.class), false, true, false, null));
    }

}