package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedDecodePositionInvalidDataTest {

    private SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

    @Test
    public void decodePositionInvalidDataTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("test", null, null, null));

        String invalidDecodingData = "invalidData";
        Position result = decoder.decodePosition(null, invalidDecodingData);

        assertEquals(null, result);
    }

}