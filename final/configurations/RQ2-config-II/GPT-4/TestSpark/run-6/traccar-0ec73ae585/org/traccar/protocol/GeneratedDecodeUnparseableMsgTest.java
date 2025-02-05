package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Network;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeUnparseableMsgTest {

    @Test
    public void decodeUnparseableMsgTest() throws Exception {
        Protocol protocol = new Protocol("testProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        String msg = "abcd";
        assertNull(decoder.decode(channel, remoteAddress, msg));
    }

}