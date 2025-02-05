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

public class GeneratedDecodeValidMessageTest {

    @Test
    public void decodeValidMessageTest() {
        Protocol mockProtocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(mockProtocol);
        Channel mockChannel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = "Some valid message";

        Object result = decoder.decode(mockChannel, remoteAddress, msg);

        assertNotNull(result);
        assertTrue(result instanceof Position);
    }

}