package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedDecodeHexStringTest {

    private static final String HEX_MESSAGE = "1a2b3c4d5e6f";
    private static final String EXPECTED_STRING = "123456";

    @Test
    public void decodeHexStringTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol("watchProtocol"));
        SocketAddress remoteAddress = new InetSocketAddress("127.0.0.1", 8080);
        String decodedData = (String) watchProtocolDecoder.decode(channel, remoteAddress, HEX_MESSAGE);
        Assert.assertEquals(EXPECTED_STRING, decodedData);
    }

}