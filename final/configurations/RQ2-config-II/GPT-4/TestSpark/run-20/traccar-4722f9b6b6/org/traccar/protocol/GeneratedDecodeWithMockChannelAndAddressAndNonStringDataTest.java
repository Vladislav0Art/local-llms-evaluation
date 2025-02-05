package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;

public class GeneratedDecodeWithMockChannelAndAddressAndNonStringDataTest {

    @Test
    public void decodeWithMockChannelAndAddressAndNonStringDataTest() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        ByteBuf msg = Unpooled.buffer().writeInt(123);

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress address = Mockito.mock(SocketAddress.class);

        Object result = null;
        try {
            result = decoder.decode(channel, address, msg);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Assert.assertNull(result);
    }

}