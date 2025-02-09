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

public class GeneratedDecodeValidMessageTest {

    @Test
    public void decodeValidMessageTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(Mockito.mock(Protocol.class));

        String testMsg = "This is a test message";
        ByteBuf buffer = Unpooled.wrappedBuffer(testMsg.getBytes());

        Object decodedMessage = decoder.decode(Mockito.mock(Channel.class), new InetSocketAddress("localhost", 5000), buffer);

        Assert.assertTrue(decodedMessage instanceof Position);
    }

}