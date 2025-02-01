package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

public class GeneratedDecodeDecodePositionNotMatchesTest {

    @Test
    public void decodeDecodePositionNotMatchesTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        String data = "not matching pattern";
        Assert.assertNull(decoder.decodePosition(new DeviceSession(), data));
    }

}