package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

public class GeneratedTestDecodeWithoutIndex {

    @Test
    public void testDecodeWithoutIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder();
        Assert.assertFalse(decoder.getHasIndex());
    }

}