package org.traccar.protocol;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.BaseProtocol;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;

import static org.junit.Assert.assertNotNull;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedDecodeHeartTest {

    private static class TestProtocol extends BaseProtocol {
        TestProtocol() {
            super("testWatchProtocol");
        }
    }

    private TestProtocol protocol = new TestProtocol();
    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

    @Test
    public void decodeHeartTest() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress socketAddress = mock(SocketAddress.class);
        ByteBuf buf = Unpooled.copiedBuffer("[3G*3305882304*000F*HEART,95]", StandardCharsets.US_ASCII);

        Object positionResult = decoder.decode(channel, socketAddress, buf.duplicate());
        assertNotNull(positionResult);
    }

}