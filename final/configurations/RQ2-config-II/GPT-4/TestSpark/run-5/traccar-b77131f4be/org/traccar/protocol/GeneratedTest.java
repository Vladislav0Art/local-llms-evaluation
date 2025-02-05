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

public class GeneratedTest {

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

    @Test
    public void decodeInvalidMessageTest() {
        Protocol mockProtocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(mockProtocol);
        Channel mockChannel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = "Invalid message";

        Object result = decoder.decode(mockChannel, remoteAddress, msg);

        assertNull(result);
    }

    @Test
    public void decodeNullMessageTest() {
        Protocol mockProtocol = mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(mockProtocol);
        Channel mockChannel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = null;

        Object result = decoder.decode(mockChannel, remoteAddress, msg);

        assertNull(result);
    }

    @Test
    public void GalileoProtocolDecoderConstructorTest() {
        Protocol mockProtocol = mock(Protocol.class);

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(mockProtocol);

        assertNotNull(decoder);
    }

    @Test
    public void GalileoProtocolDecoderConstructorNullProtocolTest() {
        Protocol mockProtocol = null;

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(mockProtocol);
    }

}