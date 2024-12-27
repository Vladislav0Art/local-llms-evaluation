package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Protocol;

import java.net.SocketAddress;
import java.nio.channels.Channel;

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

class GalileoProtocolDecoder extends BaseProtocolDecoder {
    public GalileoProtocolDecoder(Protocol protocol) {
        super(protocol);
    }

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
        return null;
    }
}

}