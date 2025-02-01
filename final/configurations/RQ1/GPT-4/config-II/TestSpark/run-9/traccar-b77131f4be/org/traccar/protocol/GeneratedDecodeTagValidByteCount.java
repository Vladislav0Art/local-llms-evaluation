package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class GeneratedDecodeTagValidByteCount {

    Position position = new Position();

    private GalileoProtocolDecoder galileoProtocolDecoder = new GalileoProtocolDecoder(new Protocol("galileo"));

    @Test
    public void decodeTagValidByteCount() {
        byte[] bytes = new byte[]{0x01};
        ByteBuf byteBuf = Unpooled.wrappedBuffer(bytes);
        galileoProtocolDecoder.decodeTag(position, byteBuf, 0x01);
        assertEquals(1, position.getAttributes().size());
    }

}