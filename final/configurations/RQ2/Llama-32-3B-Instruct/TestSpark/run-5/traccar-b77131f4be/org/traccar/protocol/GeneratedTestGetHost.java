package org.traccar.protocol;

public class GeneratedTestGetHost {

    @Test
    public void testGetHost() {
        SocketAddress socketAddress = new SocketAddress("example.com", 1234);
        assertEquals("example.com", socketAddress.getHost());
    }

}