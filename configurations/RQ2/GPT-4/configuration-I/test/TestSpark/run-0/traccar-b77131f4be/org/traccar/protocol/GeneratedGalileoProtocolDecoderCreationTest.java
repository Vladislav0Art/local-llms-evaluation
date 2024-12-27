package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.protocol.GalileoProtocolDecoder;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import io.netty.channel.Channel;

public class GeneratedGalileoProtocolDecoderCreationTest {

    @Test
    public void GalileoProtocolDecoderCreationTest() {
        Protocol protocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

}