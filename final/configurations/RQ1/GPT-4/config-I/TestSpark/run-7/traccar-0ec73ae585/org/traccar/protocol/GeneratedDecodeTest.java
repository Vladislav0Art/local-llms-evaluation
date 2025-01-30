package org.traccar.protocol;

import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import org.traccar.Context;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedDecodeTest {

    private ByteBuf buf(String string) {
        return Unpooled.wrappedBuffer(string.getBytes(StandardCharsets.US_ASCII));
    }

    @Test
    public void decodeTest() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress socketAddress = mock(SocketAddress.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch") {
        });

        // No exception should be thrown when message is empty
        ByteBuf bufEmpty = buf("");
        decoder.decode(channel, socketAddress, bufEmpty);

        ByteBuf bufMsg = buf("[SG*9051007490*0002*LK]");
        Position position = (Position) decoder.decode(channel, socketAddress, bufMsg);

        Assert.assertNotNull(position);
        Assert.assertNotNull(position.getDeviceId());
        Assert.assertEquals("9051007490", position.getDeviceId());

        bufMsg = buf("[SG*9051007490*0008*ALARM1]");
        position = (Position) decoder.decode(channel, socketAddress, bufMsg);

        Assert.assertNotNull(position);
        Assert.assertEquals("9051007490", position.getDeviceId());
    }

}