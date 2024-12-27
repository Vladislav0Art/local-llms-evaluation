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
public class GeneratedDecode_ValidMessage_ReturnInstance {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @InjectMocks
    private Gt06ProtocolDecoder decoder;

    @Test
    public void decode_ValidMessage_ReturnInstance() throws Exception {
        when(channel.getRemoteAddress()).thenReturn(Mockito.mock(SocketAddress.class));
        Object result = decoder.decode(channel, Mockito.mock(SocketAddress.class), new Object());
        assertNull(result);
    }

}