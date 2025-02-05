package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

public class GeneratedProtocolDecoderCreationTest {

    // Test decoder creation

    @Test
    public void protocolDecoderCreationTest() {
        Protocol protocol = new Protocol("WatchProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Assert.assertNotNull(decoder);
    }

}