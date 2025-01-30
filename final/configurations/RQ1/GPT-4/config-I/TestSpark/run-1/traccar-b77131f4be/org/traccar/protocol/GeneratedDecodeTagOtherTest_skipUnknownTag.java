package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import static org.junit.Assert.*;

import org.junit.runners.JUnit4;

import java.net.SocketAddress;
import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedDecodeTagOtherTest_skipUnknownTag {

    private GalileoProtocolDecoder galileoProtocolDecoder;
    private Protocol protocol = Mockito.mock(Protocol.class);

    @Test
    public void decodeTagOtherTest_skipUnknownTag() {
        Position position = new Position();
        ByteBuf buffer = Unpooled.copiedBuffer(new byte[]{0x01});
        galileoProtocolDecoder.decodeTagOther(position, buffer, 0xee);
        assertTrue(position.getAttributes().isEmpty());
    }

}