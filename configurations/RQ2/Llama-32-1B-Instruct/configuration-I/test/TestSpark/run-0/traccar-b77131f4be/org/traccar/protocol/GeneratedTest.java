package org.traccar.protocol;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testDecode_GalileoMessage() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(channel, remoteAddress, msg)).thenReturn(GalileoProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, msg);
        assertEquals(GalileoProtocolDecoder.class, result.getClass());
    }

    @Test
    public void testDecode_GarlicMessage() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(channel, remoteAddress, msg)).thenReturn(GarlicProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, msg);
        assertEquals(GarlicProtocolDecoder.class, result.getClass());
    }

    @Test
    public void testDecode_EmptyMessage() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(channel, remoteAddress, msg)).thenReturn(GalileoProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, msg);
        assertEquals(GalileoProtocolDecoder.class, result.getClass());
    }

    @Test
    public void testDecode_NoChannel() throws Exception {
        Channel channel = null;
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = mock(Object.class);

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(remoteAddress, "", msg)).thenReturn(GalileoProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, msg);
        assertEquals(GalileoProtocolDecoder.class, result.getClass());
    }

    @Test
    public void testDecode_NoRemoteAddress() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = null;
        Object msg = mock(Object.class);

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(channel, remoteAddress, msg)).thenReturn(GalileoProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, msg);
        assertEquals(GalileoProtocolDecoder.class, result.getClass());
    }

    @Test
    public void testDecode_NoObject() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        String message = "Hello";

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(channel, remoteAddress, message)).thenReturn(GalileoProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, message);
        assertEquals(GalileoProtocolDecoder.class, result.getClass());
    }

    @Test
    public void testDecode_NoMessage() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        String message = null;

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(channel, remoteAddress, message)).thenReturn(GalileoProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, message);
        assertEquals(GalileoProtocolDecoder.class, result.getClass());
    }

    @Test
    public void testDecode_EmptyMessageMessage() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        String message = "Hello";

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(channel, remoteAddress, message)).thenReturn(GarlicProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, message);
        assertEquals(GarlicProtocolDecoder.class, result.getClass());
    }

    @Test
    public void testDecode_EmptyMessageGarlic() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        String message = "";

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(channel, remoteAddress, message)).thenReturn(GarlicProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, message);
        assertEquals(GarlicProtocolDecoder.class, result.getClass());
    }

    @Test
    public void testDecode_EmptyMessageNoChannel() throws Exception {
        Channel channel = null;
        SocketAddress remoteAddress = mock(SocketAddress.class);
        String message = "";

        Protocol protocol = new GalileoProtocol();
        when(protocol.decode(remoteAddress, "", message)).thenReturn(GarlicProtocolDecoder.class);

        Object result = protocol.decode(channel, remoteAddress, message);
        assertEquals(GarlicProtocolDecoder.class, result.getClass());
    }

}