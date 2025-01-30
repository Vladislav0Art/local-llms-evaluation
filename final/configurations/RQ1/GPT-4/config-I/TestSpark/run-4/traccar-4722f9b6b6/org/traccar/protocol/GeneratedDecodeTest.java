package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.Protocol;
import org.traccar.session.SessionManager;

import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        ByteBuf msg = Unpooled.wrappedBuffer("[CS*0123456789*SIM]".getBytes(StandardCharsets.US_ASCII));
        Channel channel = Mockito.mock(Channel.class);
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object result = decoder.decode(channel, null, msg);
        Assert.assertNull(result);
    }

}