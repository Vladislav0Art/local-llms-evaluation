package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestClose {

    @Test
    public void testClose() {
        Channel channel = createChannel(12345);
        try {
            channel.close();
            fail("Expected close exception");
        } catch (Exception e) {
            // expected exception
        }
    }

    private Channel createChannel(int port) {
        return new Channel();
    }
}

}