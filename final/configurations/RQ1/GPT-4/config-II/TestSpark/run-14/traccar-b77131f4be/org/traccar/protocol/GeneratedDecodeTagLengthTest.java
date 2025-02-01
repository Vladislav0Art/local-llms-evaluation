package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedDecodeTagLengthTest {

    @Test
    public void decodeTagLengthTest() {
        try {
            GalileoProtocolDecoder.getTagLength(0x3A);
        } catch (IllegalArgumentException e) {
            assert (e.getMessage().equals("Unknown tag: 0x3a"));
        }
    }

}