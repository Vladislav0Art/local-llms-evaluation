package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

public class GeneratedGetHasIndexTest {

    private WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void getHasIndexTest() {
        Assert.assertTrue(watchProtocolDecoder.getHasIndex());
    }

}