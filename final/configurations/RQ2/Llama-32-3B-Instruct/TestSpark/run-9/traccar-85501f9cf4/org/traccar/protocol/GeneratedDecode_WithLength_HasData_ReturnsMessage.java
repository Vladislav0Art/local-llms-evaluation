package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;
import org.mockito.Mockito;

public class GeneratedDecode_WithLength_HasData_ReturnsMessage {

    @Test
    public void decode_WithLength_HasData_ReturnsMessage() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Gt06ProtocolDecoder.class);
        Object result = Mockito.mock(Object.class);
        Object msg = "message";
        assertSame(msg, decoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), Mockito.mock(Object.class)));
    }

}