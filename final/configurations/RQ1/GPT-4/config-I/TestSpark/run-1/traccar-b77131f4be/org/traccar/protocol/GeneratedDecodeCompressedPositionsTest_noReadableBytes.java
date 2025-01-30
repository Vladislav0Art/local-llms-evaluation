package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.junit.Assert.*;

import org.junit.runners.JUnit4;

import java.net.SocketAddress;
import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedDecodeCompressedPositionsTest_noReadableBytes {

    private GalileoProtocolDecoder galileoProtocolDecoder;
    private Protocol protocol = Mockito.mock(Protocol.class);

    @Test
    public void decodeCompressedPositionsTest_noReadableBytes() throws Exception {
        galileoProtocolDecoder = new GalileoProtocolDecoder(protocol);
        ByteBuf buffer = Unpooled.copiedBuffer(new byte[]{0x00, 0x00});

        assertNull(galileoProtocolDecoder.decode(null, null, buffer));
    }

}