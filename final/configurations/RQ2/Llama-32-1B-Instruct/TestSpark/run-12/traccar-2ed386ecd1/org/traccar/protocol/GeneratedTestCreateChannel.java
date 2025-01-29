package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCreateChannel {

    @Test
    public void testCreateChannel() {
        Channel channel = createChannel(12345);
        assertNotNull(channel);
        assertNull(channel.close());
    }

    private Channel createChannel(int port) {
        return new Channel();
    }

}