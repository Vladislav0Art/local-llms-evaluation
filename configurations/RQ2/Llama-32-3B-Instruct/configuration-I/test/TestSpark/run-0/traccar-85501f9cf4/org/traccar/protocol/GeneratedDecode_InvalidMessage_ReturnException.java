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
public class GeneratedDecode_InvalidMessage_ReturnException {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @InjectMocks
    private Gt06ProtocolDecoder decoder;

    @Test
    public void decode_InvalidMessage_ReturnException() {
        when(channel.getRemoteAddress()).thenReturn(Mockito.mock(SocketAddress.class));
        Exception exception = assertThrows(Exception.class, () -> decoder.decode(channel, Mockito.mock(SocketAddress.class), "invalid message"));
        assertNotNull(exception.getMessage());
    }

}