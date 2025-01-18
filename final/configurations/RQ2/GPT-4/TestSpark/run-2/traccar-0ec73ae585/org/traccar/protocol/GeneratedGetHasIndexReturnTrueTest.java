package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.protocol.WatchProtocolDecoder;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHasIndexReturnTrueTest {

    @Mock
    private Channel channel;

    @Test
    public void getHasIndexReturnTrueTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        boolean result = decoder.getHasIndex();
        Assert.assertEquals(true, result);
    }

}