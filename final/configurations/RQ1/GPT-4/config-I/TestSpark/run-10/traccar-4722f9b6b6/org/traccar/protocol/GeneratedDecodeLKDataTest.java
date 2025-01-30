package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeLKDataTest {

    @Mock
    private Protocol protocol;
    @Mock
    private Channel channel;

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

    @Test
    public void decodeLKDataTest() throws Exception {
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 50000);
        ByteBuf buf = Unpooled.copiedBuffer("[3G*7800000000*002c*UD,040614,090352,A,01.810094,N,103.594909,E,30.00,45.90,7.50,20,0,0,898521,6553139,7,1,2]", StandardCharsets.US_ASCII);
        when(channel.remoteAddress()).thenReturn(remoteAddress);

        Object result = decoder.decode(channel, remoteAddress, buf);

        assertTrue(result instanceof Position);
    }

}