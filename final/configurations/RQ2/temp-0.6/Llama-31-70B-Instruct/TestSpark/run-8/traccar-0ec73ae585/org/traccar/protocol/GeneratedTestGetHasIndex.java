package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedTestGetHasIndex {

    private WatchProtocolDecoder watchProtocolDecoder;

    public void setUp() {
        watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());
    }

    @Test
    public void testGetHasIndex() {
        Assert.assertTrue(watchProtocolDecoder.getHasIndex());
    }

}