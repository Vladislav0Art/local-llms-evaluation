package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

import static org.mockito.Mockito.*;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertThat;

public class GeneratedDecodeWithKnownMessageTest {

    @Test
    public void decodeWithKnownMessageTest() throws Exception {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        ByteBuf msg = Unpooled.wrappedBuffer("UD*1234*567*080807a0543.8N00112.4E000.012051100.00,00000001,0002".getBytes(StandardCharsets.US_ASCII));
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);
        Object result = decoder.decode(channel, remoteAddress, msg);

        Mockito.verify(protocol, times(0)).identify(remoteAddress, "1234");
        Mockito.verify(protocol, times(0)).getLastLocation(any(), anyLong());

        assertFalse(result == null);
    }

}