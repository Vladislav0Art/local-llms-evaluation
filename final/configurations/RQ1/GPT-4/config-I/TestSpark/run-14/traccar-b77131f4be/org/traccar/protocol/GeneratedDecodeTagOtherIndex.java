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
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeTagOtherIndex {

    private ByteBuf prepare1ByteData(int value) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeByte(value);
        return buffer;
    }

    private ByteBuf prepare2ByteData(int value) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeShortLE(value);
        return buffer;
    }

    private ByteBuf prepare4ByteData(long value) {
        ByteBuf buffer = Unpooled.buffer();
        buffer.writeIntLE((int) value);
        return buffer;
    }

    private ByteBuf prepareBatchData(Object... values) {
        ByteBuf buffer = Unpooled.buffer();
        for (Object value : values) {
            if (value instanceof Integer) {
                buffer.writeByte((int) value);
            } else if (value instanceof String) {
                buffer.writeBytes(((String) value).getBytes(StandardCharsets.US_ASCII));
            }
        }
        return buffer;
    }

    @Test
    public void decodeTagOtherIndex() {
        GalileoProtocolDecoder protocolDecoder = new GalileoProtocolDecoder(new Protocol());
        Position position = new Position();
        protocolDecoder.decodeTagOther(position, prepare2ByteData(10), 0x10);
        assertEquals(10, (int) position.getInteger(Position.KEY_INDEX));
    }

}