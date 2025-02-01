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

public class GeneratedTest {

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

    @Test
    public void decodeTagOtherUnsupportedTagFormatTest() {
        byte[] bytes = new byte[]{0x01, 0x02, 0x03, 0x04};
        ByteBuf byteBuf = Unpooled.wrappedBuffer(bytes);
        position = new Position();
        galileoProtocolDecoder.decodeTagOther(position, byteBuf, 0x11);
        assertTrue(position.getAttributes().isEmpty());
    }

    @Test
    public void decodeTagValidByteCount() {
        byte[] bytes = new byte[]{0x01};
        ByteBuf byteBuf = Unpooled.wrappedBuffer(bytes);
        galileoProtocolDecoder.decodeTag(position, byteBuf, 0x01);
        assertEquals(1, position.getAttributes().size());
    }

    @Test
    public void getTagLengthForUnknownTagTest() {
        galileoProtocolDecoder.getTagLength(0xee);
    }

    @Test
    public void decodeTagTestValidPosition() {
        ByteBuf byteBuf = Unpooled.buffer();
        byteBuf.writeBytes(new byte[]{0x02});
        Position position = new Position();
        galileoProtocolDecoder.decodeTag(position, byteBuf, 0x02);
        assertEquals(1, position.getAttributes().size());
    }

    @Test
    public void decodeIridiumPositionTest() throws Exception {
        ByteBuf byteBuf = Unpooled.buffer();
        byteBuf.writeShortLE(20);
        byteBuf.writeBytes(new byte[]{0x01, 0x00, 0x1c});
        byteBuf.writeIntLE(1000);
        byteBuf.writeCharSequence("123456789012345", StandardCharsets.US_ASCII);
        byteBuf.writeByte(0x01);
        byteBuf.writeBytes(new byte[]{0x00, 0x00, 0x00, 0x00});
        byteBuf.writeIntLE(1000);
        byteBuf.writeBytes(new byte[]{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00});
        byteBuf.writeBytes(new byte[]{0x01, 0x00, 0x1c});
        byteBuf.writeBytes(new byte[]{0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00});

        SocketAddress socketAddress = Mockito.mock(SocketAddress.class);
        final InvocationOnMock[] savedArgs = {null};
        when(galileoProtocolDecoder.getDeviceSession(any(), any(), any())).thenAnswer(new Answer() {
            @Override
            public Void answer(InvocationOnMock invocation) {
                savedArgs[0] = invocation;
                return null;
            }
        });
        Position position = (Position) galileoProtocolDecoder.decode(Unpooled.buffer(), socketAddress, byteBuf.array());
        assertNotNull(position);
    }

}