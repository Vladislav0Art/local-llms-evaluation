package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GeneratedTestNetworkMessageConstructor {

    @Test
    public void testNetworkMessageConstructor() {
        String protocol = "http";
        Object msg = new NetworkMessage(protocol);
        assertTrue(msg instanceof NetworkMessage);
    }

}