package org.traccar.protocol;

import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.junit.Assert;
import org.junit.Test;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedDecodeInvalidMessageTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

    @Test
    public void decodeInvalidMessageTest() throws Exception {
        SocketAddress sa = new InetSocketAddress("localhost", 8080);
        Channel mockChannel = Mockito.mock(Channel.class);
        Object msg = Unpooled.copiedBuffer("*HQ,1234567890,V1,Goeg,430916,Invalid,N,08552.40284,E,0.00,0,00000000,60#".getBytes(StandardCharsets.UTF_8));
        Assert.assertNull(decoder.decode(mockChannel, sa, msg));
    }

}