package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        when(decoder.getHasIndex()).thenReturn(true);
        String result = decoder.getHasIndex();
        assertEquals("true", result);
    }

    @Test
    public void testGetManufacturer() {
        Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        when(decoder.getManufacturer()).thenReturn("Some Manufacturer");
        String result = decoder.getManufacturer();
        assertEquals("Some Manufacturer", result);
    }

    @Test
    public void testDecodeChannels() {
        Mockito.mock(Channel.class, Mockito.RETURNS_RANDOM_VALUE);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        when(decoder.decode(any Channel.class, any SocketAddress.class, any Object.class)).thenReturn("Random Data");
        String result = decoder.decode(Mockito.any(Channel.class), Mockito.any(SocketAddress.class, Mockito.any(Object.class));
        assertEquals("Random Data", result);
    }

    @Test
    public void testDecodeMessages() {
        Mockito.mock(Object.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        when(decoder.decode(any Channel.class, any SocketAddress.class, any Object.class)).thenReturn("Some Message");
        String result = decoder.decode(Mockito.any(Channel.class), Mockito.any(SocketAddress.class, Mockito.any(Object.class));
        assertEquals("Some Message", result);
    }

    @Test
    public void testDecodeProtocol() {
        Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        when(decoder.decode(any Channel.class, any SocketAddress.class, any Object.class)).thenReturn(decoder.getProtocol());
        Protocol protocol = Mockito.mock(Protocol.class);
        when(decoder.getProtocol()).thenReturn(protocol);
        String result = decoder.decode(Mockito.any(Channel.class), Mockito.any(SocketAddress.class, Mockito.any(Object.class));
        assertEquals(protocol, result);
    }

    @Test
    public void testDecodeMessageCount() {
        Mockito.mock(Object.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        when(decoder.decode(any Channel.class, any SocketAddress.class, any Object.class)).thenReturn("Some Message Count");
        String result = decoder.decode(Mockito.any(Channel.class), Mockito.any(SocketAddress.class, Mockito.any(Object.class));
        assertEquals("Some Message Count", result);
    }

}