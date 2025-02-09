package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedDecodeValidMessageTest {

    @Test
    public void decodeValidMessageTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        EmbeddedChannel channel = new EmbeddedChannel(decoder);

        ByteBuf byteBuf = Unpooled.buffer();
        // Write data into byteBuf appropriate for your `decode` method to parse.
        channel.writeInbound(new NetworkMessage(byteBuf, new InetSocketAddress("127.0.0.1", 5001)));
        Position position = (Position) channel.readInbound();

        // Verify the attributes inside the position object.
    }

}