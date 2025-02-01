package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneratedDecodeInitCheckTest {

    @Test
    public void decodeInitCheckTest() throws Exception {
        WatchProtocolDecoder wDecoder = new WatchProtocolDecoder(new Protocol("watch"));

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        ByteBuf buf = Unpooled.copiedBuffer("[3G*41001234561*007B*INIT1234562,820049040,1,null,-32003]", StandardCharsets.US_ASCII);
        String expectedResponse = "[3G*41001234561*007B*0006*INIT,1]";

        wDecoder.decode(channel, remoteAddress, buf);

        Mockito.verify(channel).writeAndFlush(expectedResponse);
    }

}