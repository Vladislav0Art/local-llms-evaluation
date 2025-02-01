package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

public class GeneratedDecodeINITTest {

    @Test
    public void decodeINITTest() throws Exception {
        // Given
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        String hex = "5b4a592a30303030303030303030302a303030302a30494154542d34205d00";
        ByteBuf buf = Unpooled.copiedBuffer(hexStringToByteArray(hex));

        // When
        Object result = decoder.decode(channel, remoteAddress, buf);

        // Then
        Assert.assertNull(result);
        verify(channel, atLeast(1)).writeAndFlush(any());
    }

    private static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }

}