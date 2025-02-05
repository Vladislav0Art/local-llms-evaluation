package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGalileoProtocolDecoderConstructorNullProtocolTest {

    @Test
    public void GalileoProtocolDecoderConstructorNullProtocolTest() {
        Protocol mockProtocol = null;

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(mockProtocol);
    }

}