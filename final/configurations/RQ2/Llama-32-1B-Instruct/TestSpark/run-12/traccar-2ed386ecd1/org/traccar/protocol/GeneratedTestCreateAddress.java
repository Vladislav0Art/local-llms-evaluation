package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCreateAddress {

    @Test
    public void testCreateAddress() {
        SocketAddress address = createAddress(12345, "example.com");
        assertNotNull(address);
        assertNull(address.close());
    }

    private SocketAddress createAddress(int port, String host) {
        return new SocketAddress();
    }
}

}