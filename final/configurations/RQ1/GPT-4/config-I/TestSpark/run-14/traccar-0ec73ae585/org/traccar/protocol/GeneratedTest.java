package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    private SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
    private Protocol protocol = Mockito.mock(Protocol.class);

    @Test
    public void decodeTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        ByteBuf msg = Unpooled.copiedBuffer("[3G*123456789*0009*LK]", StandardCharsets.US_ASCII);

        Mockito.when(channel.remoteAddress()).thenReturn(remoteAddress);

        decoder.decode(channel, remoteAddress, msg);

        verify(protocol, times(1)).getSupportedDataCommands();
    }

    @Test
    public void decodeWithExceptionTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        ByteBuf msg = Unpooled.copiedBuffer("[3G*123456789*0009*LK]", StandardCharsets.US_ASCII);

        Mockito.when(channel.remoteAddress()).thenReturn(remoteAddress);
        doThrow(new Exception("Test Exception")).when(protocol).getSupportedDataCommands();

        decoder.decode(channel, remoteAddress, msg);
    }

}