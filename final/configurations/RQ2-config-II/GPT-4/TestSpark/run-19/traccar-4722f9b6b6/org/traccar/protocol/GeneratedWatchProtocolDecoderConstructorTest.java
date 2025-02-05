package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import org.traccar.Protocol;

public class GeneratedWatchProtocolDecoderConstructorTest {

    @Test
    public void watchProtocolDecoderConstructorTest() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watch"));
        Assert.assertNotNull(watchProtocolDecoder);
    }

}