package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeValidDataTest {

    private static final String deviceUniqueIdentifier = "1234567890";
    private static final Protocol protocol = new Protocol("galileo");
    private static final GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

    @Test
    public void decodeValidDataTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        ByteBuffer buf = ByteBuffer.allocate(10);
        buf.put(deviceUniqueIdentifier.getBytes(StandardCharsets.US_ASCII));
        Object msg = Unpooled.copiedBuffer(buf.array());

        Position position = (Position) decoder.decode(channel, remoteAddress, msg);

        assertEquals(deviceUniqueIdentifier, position.getDeviceId());
    }

}