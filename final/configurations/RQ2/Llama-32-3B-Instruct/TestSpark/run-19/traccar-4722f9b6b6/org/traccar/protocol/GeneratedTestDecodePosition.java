package org.traccar.protocol;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayBuffer;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedTestDecodePosition {

    public static class UnpunchedBuffer {
        public static ByteBuf get() {
            byte[] buffer = new byte[]{0x01, 0x02, 0x03, 0x04};
            return Unpooled.copiedBuffer(buffer);
        }
    }

    public static class WatchProtocolDecoder {
        public void decode(ByteBuf buffer) {
            buffer.setReadable(UnpunchedBuffer.get(), true);
        }
    }

    @Test
    public void testDecodePosition() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder();
        ByteBuf buffer = UnpunchedBuffer.get();

        decoder.decode(buffer);
        assertThat(buffer.readableBytes(), is(4));
        assertThat((int) buffer.readIntLE(), is(1));
    }

    public static class BufferUtils {
        public static int readableBytes(ByteBuf buffer) {
            return buffer.readableBytes();
        }

        public static int readIntLE(ByteBuf buffer) {
            int result = 0;
            for (int i = 0; i < 4; i++) {
                result |= (buffer.readIntLE() & 0xFF) << (i * 8);
            }
            return result;
        }

        public static void setReadable(ByteBuf buffer, byte[] data, boolean readable) {
            buffer.setReadable(data, readable);
        }
    }

}