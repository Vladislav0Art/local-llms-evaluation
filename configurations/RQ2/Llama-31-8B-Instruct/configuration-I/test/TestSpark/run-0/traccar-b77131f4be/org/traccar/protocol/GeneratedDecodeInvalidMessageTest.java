package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.ProtocolDecoder;
import org.traccar.model.ProtocolMessage;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.protocol.Protocol;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeInvalidMessageTest {

    @InjectMocks
    private GalileoProtocolDecoder decoder;

    @Mock
    private BaseProtocolDecoder baseDecoder;

    @Mock
    private Protocol protocol;

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        when(protocol.getName()).thenReturn("Galileo");
        when(protocol.getProtocolId()).thenReturn(1);
        when(protocol.getProtocolName()).thenReturn("Galileo Protocol");
        when(protocol.getProtocolType()).thenReturn("GALILEO");
        when(protocol.getProtocolVersion()).thenReturn(1.0);
        when(protocol.getProtocolDescription()).thenReturn("Galileo Protocol Description");

        assertThrows(Exception.class, () -> decoder.decode(null, null, "invalid message"));
    }
}

}