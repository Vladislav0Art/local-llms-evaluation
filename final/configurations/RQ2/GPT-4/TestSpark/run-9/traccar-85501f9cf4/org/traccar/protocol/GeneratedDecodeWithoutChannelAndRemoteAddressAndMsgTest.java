package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.util.TimeZone;

public class GeneratedDecodeWithoutChannelAndRemoteAddressAndMsgTest {

    @Test
    public void decodeWithoutChannelAndRemoteAddressAndMsgTest() throws Exception {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(mockProtocol);

        Object result = decoder.decode(null, null, null);

        Assert.assertNull(result);
    }

}