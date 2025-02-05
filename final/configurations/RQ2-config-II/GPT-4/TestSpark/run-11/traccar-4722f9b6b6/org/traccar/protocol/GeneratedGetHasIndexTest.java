package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

public class GeneratedGetHasIndexTest {

    // Test decoder creation

    @Test
    public void getHasIndexTest() {
        Protocol protocol = new Protocol("WatchProtocolTest");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        // Providing a dummy implementation for demonstration
        // Add actual assertion check based on the method logic
        Assert.assertFalse(decoder.getHasIndex());
    }

}