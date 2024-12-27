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
public class GeneratedNewDecoderTest {

    @InjectMocks
    private GalileoProtocolDecoder decoder;

    @Mock
    private BaseProtocolDecoder baseDecoder;

    @Mock
    private Protocol protocol;

    @Test
    public void newDecoderTest() {
        assertNotNull(new GalileoProtocolDecoder(protocol));
    }

}