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
public class GeneratedDecodeTest_unknownHeader {

    private GalileoProtocolDecoder galileoProtocolDecoder;
    private Protocol protocol = Mockito.mock(Protocol.class);

    @Test
    public void decodeTest_unknownHeader() throws Exception {
        galileoProtocolDecoder = new GalileoProtocolDecoder(protocol);
        ByteBuf buffer = Unpooled.copiedBuffer(new byte[]{0x02, 0x03, 0x04});

        assertNull(galileoProtocolDecoder.decode(null, null, buffer));
    }

}