package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.mockito.Mockito;

import java.net.SocketAddress;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGalileoProtocolDecoderConstructorTest {

    private GalileoProtocolDecoder decoder;

    @Test
    public void GalileoProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("Galileo");
        decoder = new GalileoProtocolDecoder(protocol);
        assertTrue(decoder instanceof GalileoProtocolDecoder);
    }

}