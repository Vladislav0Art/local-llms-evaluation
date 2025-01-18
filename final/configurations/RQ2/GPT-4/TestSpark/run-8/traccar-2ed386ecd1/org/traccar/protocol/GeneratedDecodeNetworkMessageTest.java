package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeNetworkMessageTest {

    @Test
    public void decodeNetworkMessageTest() throws Exception {
        Gt06ProtocolDecoder decoder = Mockito.mock(Gt06ProtocolDecoder.class);
        byte[] array = ByteBufUtil.decodeHexDump("1100000000");
        Object msg = Unpooled.copiedBuffer(array).toString(StandardCharsets.UTF_8);

        assertNotNull(decoder.decode(null, null, msg));
    }

}