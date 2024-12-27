package org.traccar.protocol;

import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.protocol.Protocol;

import java.nio.channels.Channel;
import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeWithMockedParamsTest {

    @Test
    public void decodeWithMockedParamsTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Channel channel = mock(Channel.class);
        SocketAddress address = mock(SocketAddress.class);
        ByteBuf msg = Unpooled.buffer();
        msg.writeInt(16);
        assertNotNull(decoder.decode(channel, address, msg));
    }

}