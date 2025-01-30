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

public class GeneratedDecodePositionTest {

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
    public void decodePositionTest() throws Exception {
        Method method = WatchProtocolDecoder.class.getDeclaredMethod("decodePosition", String.class);
        method.setAccessible(true);
        WatchProtocolDecoder decoder = getDecoder();
        Position decodePosition = (Position) method.invoke(decoder, "UD,013,040311,A,53.876800,N,30.321600,E,10.64,99.9,101.1,8,10,97,,10,1A0F,SYST:0,E,,1,4,,3,250,1,5264,60301,23,5263,18061,16,,");
        assertNull(decodePosition);
    }

}