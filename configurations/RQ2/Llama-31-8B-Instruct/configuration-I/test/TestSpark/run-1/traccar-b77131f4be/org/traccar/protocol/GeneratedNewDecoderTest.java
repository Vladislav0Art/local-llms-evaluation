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
public class GeneratedNewDecoderTest {

    @InjectMocks
    private GalileoProtocolDecoder decoder;

    @Mock
    private Protocol protocol;

    @Test
    public void newDecoderTest() {
        assertNotNull(new GalileoProtocolDecoder(protocol));
    }

}