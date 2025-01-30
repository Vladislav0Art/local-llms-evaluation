package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.socket.DatagramChannel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;

import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

public class GeneratedDecodeTest {

    private WatchProtocolDecoder getDecoder() {
        Protocol protocol = Mockito.mock(Protocol.class);
        when(protocol.getName()).thenReturn("protocol_name");
        when(protocol.getSupportedDataCommands()).thenReturn(new HashSet<>());
        return new WatchProtocolDecoder(protocol);
    }

    private ByteBuf getBuf(String hex) {
        byte[] bytes = new byte[hex.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) ((Character.digit(hex.charAt(i * 2), 16) << 4)
                    + Character.digit(hex.charAt(i * 2 + 1), 16));
        }
        return Unpooled.wrappedBuffer(bytes);
    }

    @Test
    public void decodeTest() throws Exception {
        WatchProtocolDecoder decoder = getDecoder();
        Channel channel = Mockito.mock(DatagramChannel.class);
        String id = "id";
        String index = "index";
        String content = "content";
        ByteBuf buf = getBuf("5B3831522A3335333530353530303437313539312A303030372A56442C3131313131312C412C22303034302E39323737222C4E2C223130313131312E39323737222C572C302C342E352C3930343D2D372C31385D");
        Method method = WatchProtocolDecoder.class.getDeclaredMethod("decode", Channel.class, SocketAddress.class, Object.class);
        method.setAccessible(true);
        Object decode = method.invoke(decoder, channel, null, buf);
        assertNull(decode);
    }

}