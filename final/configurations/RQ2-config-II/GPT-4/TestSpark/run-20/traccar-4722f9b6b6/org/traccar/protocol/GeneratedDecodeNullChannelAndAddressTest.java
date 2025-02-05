package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;

public class GeneratedDecodeNullChannelAndAddressTest {

    @Test
    public void decodeNullChannelAndAddressTest() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object msg = "testMessage";

        Object result = null;
        try {
            result = decoder.decode(null, null, msg);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertNull(result);
    }

}