package org.traccar.protocol;

import org.traccar.protocol.WatchProtocolDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import io.netty.channel.Channel;
import org.traccar.Protocol;

public class GeneratedGetHasIndexTest {

    @Mock
    private Channel channel;
    @Mock
    private Protocol protocol;

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        boolean result = decoder.getHasIndex();
        Assert.assertFalse(result);
    }

}