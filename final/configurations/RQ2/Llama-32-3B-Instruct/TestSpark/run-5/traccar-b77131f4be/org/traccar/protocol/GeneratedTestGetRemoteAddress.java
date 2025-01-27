package org.traccar.protocol;

public class GeneratedTestGetRemoteAddress {

    @Test
    public void testGetRemoteAddress() {
        Channel channel = new Channel(new SocketAddress("localhost", 8080));
        assertEquals("localhost:8080", channel.getRemoteAddress().toString());
    }
}

}