package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class GeneratedDecodeUnsupportedDataTest {

    Protocol protocol = Mockito.mock(Protocol.class);
    GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

    @Test
    public void decodeUnsupportedDataTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Integer unsupportedData = Integer.valueOf(1);

        Object decodedObj = decoder.decode(channel, remoteAddress, unsupportedData);

        Assert.assertNull(decodedObj);
    }

}