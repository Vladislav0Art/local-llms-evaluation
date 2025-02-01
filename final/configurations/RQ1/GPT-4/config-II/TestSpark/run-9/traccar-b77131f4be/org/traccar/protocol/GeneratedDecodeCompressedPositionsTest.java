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

public class GeneratedDecodeCompressedPositionsTest {

    Position position = new Position();

    private GalileoProtocolDecoder galileoProtocolDecoder = new GalileoProtocolDecoder(new Protocol("galileo"));

    @Test
    public void decodeCompressedPositionsTest() throws Exception {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(0x08);
        buffer.writeShortLE(0);
        buffer.writeBytes("compress data".getBytes(StandardCharsets.UTF_8));
        buffer.writeByte(0x01);
        buffer.writeByte(0x01);
        final List<Position> position = galileoProtocolDecoder.decode(Unpooled.buffer(), Mockito.mock(SocketAddress.class),
                buffer.array());
        assertNotNull(position);
    }

}