package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedDecodeCorrectObjectTypeCaseTest {

    @Test
    public void decodeCorrectObjectTypeCaseTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress socketAddress = Mockito.mock(SocketAddress.class);
        WatchProtocolDecoder protocolDecoder = new WatchProtocolDecoder(new Protocol("WatchProtocol"));

        byte[] byteArray = {1, 2, 3};
        Object obj = Unpooled.copiedBuffer(byteArray);

        assertEquals(obj, protocolDecoder.decode(channel, socketAddress, obj));
    }

}