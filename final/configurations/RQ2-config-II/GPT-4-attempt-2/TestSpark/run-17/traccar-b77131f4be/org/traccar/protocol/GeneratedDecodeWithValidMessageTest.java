package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnpooledHeapByteBufTest;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedDecodeWithValidMessageTest {

    @Test
    public void decodeWithValidMessageTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        SocketAddress address = Mockito.mock(SocketAddress.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        ByteBuf buffer = Unpooled.copiedBuffer("01020304".getBytes(StandardCharsets.UTF_8));
        Object result = decoder.decode(channel, address, buffer);
        Assert.assertNotNull(result);
    }

}