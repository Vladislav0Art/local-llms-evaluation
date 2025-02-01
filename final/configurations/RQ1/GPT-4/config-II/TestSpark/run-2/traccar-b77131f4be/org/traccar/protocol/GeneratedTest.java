package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoderTest;
import org.traccar.ProtocolTest;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    public GalileoProtocolDecoderTest() {
        super(new GalileoProtocolDecoder(new ProtocolTest()));
    }

    @Test
    public void decodePhotoTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x07);
        buf.writeBytes(new byte[]{0, 10, 5, 2, 7, 9, 13, 22, 0, 0});
        Object result = decoder.decode(null, null, buf);
        assertTrue(result instanceof Position);
    }

    @Test
    public void decodePositionsTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01);
        buf.writeBytes(new byte[]{5, 10, 20, 25, 40, 5, 3, 2, 1, 0, 0});
        Object result = decoder.decode(null, null, buf);
        assertTrue(result instanceof Position);
    }

    @Test
    public void decodeCompressedPositionsTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x08);
        buf.writeBytes(new byte[]{5, 15, 25, 35, 45, 55, 65, 75, 85, 95, 0, 0});
        Object result = decoder.decode(null, null, buf);
        assertTrue(result instanceof Position);
    }

    @Test
    public void decodeIridiumPositionTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01);
        buf.writeMediumLE(0x01001c);
        buf.writeBytes(new byte[]{100, 0, 11, 22, 33, 44, 55, 66, 77, 88, 99, 0, 0});
        Object result = decoder.decode(null, null, buf);
        assertTrue(result instanceof Position);
    }

    @Test
    public void getTagLengthTest() {
        int tag = 0x64;
        int expectedResult = 3;
        int actualResult = GalileoProtocolDecoder.getTagLength(tag);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void sendResponseTest() {
        Channel channel = Mockito.mock(Channel.class);
        ArgumentCaptor<ByteBuf> captor = ArgumentCaptor.forClass(ByteBuf.class);
        int header = 0x33;
        int checkSum = 25;

        decoder.sendResponse(channel, header, checkSum);
        verify(channel).writeAndFlush(captor.capture());
        ByteBuf buf = captor.getValue();
        assertEquals(header, buf.readByte());
        assertEquals(checkSum, buf.readShortLE());
    }

}