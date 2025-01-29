package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPort {

    public int port = 0;
}

@Test
public void testGetPort() {
    MockChannel channel = new MockChannel();
    assertEquals(-1, channel.getPort());
}

}