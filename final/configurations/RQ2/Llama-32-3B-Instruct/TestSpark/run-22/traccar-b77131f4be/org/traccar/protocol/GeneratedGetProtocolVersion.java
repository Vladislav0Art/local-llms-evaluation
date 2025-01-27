package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.nio.ByteBuffer;
import java.util.Date;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.traccar.protocol.GalileoProtocolDecoder.GALILEO_PROTOCOL_VERSION;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetProtocolVersion {

    @Mock
    private Protocol protocol;

    private GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

    @Test
    public void getProtocolVersion() {
        assertEquals(GALILEO_PROTOCOL_VERSION, decoder.getProtocolVersion());
    }

}