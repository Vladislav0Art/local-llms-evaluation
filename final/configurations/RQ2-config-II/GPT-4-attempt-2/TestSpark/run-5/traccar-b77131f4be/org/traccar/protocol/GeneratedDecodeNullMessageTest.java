package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.InetSocketAddress;

public class GeneratedDecodeNullMessageTest {

    @Test
    public void decodeNullMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(Mockito.mock(Protocol.class));

        Object decodedMessage = decoder.decode(Mockito.mock(Channel.class), new InetSocketAddress("localhost", 5000), null);

        Assert.assertNull(decodedMessage);
    }

}