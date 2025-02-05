package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocolDecoder;

import java.net.SocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWithNullMessageTest {

    private GalileoProtocolDecoder galileoProtocolDecoder;
    private Channel channel = Mockito.mock(Channel.class);
    SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

    @Test
    public void decodeWithNullMessageTest() throws Exception {
        galileoProtocolDecoder = new GalileoProtocolDecoder(new GalileoProtocol());
        galileoProtocolDecoder.decode(channel, remoteAddress, null);
    }

}