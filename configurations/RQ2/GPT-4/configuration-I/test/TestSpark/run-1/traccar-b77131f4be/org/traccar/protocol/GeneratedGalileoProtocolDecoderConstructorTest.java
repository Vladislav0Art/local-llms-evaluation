package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.any;

public class GeneratedGalileoProtocolDecoderConstructorTest {

    @Test
    public void GalileoProtocolDecoderConstructorTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

}