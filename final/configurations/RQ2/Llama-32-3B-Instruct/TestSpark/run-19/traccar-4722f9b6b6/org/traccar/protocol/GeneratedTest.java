package org.traccar.protocol;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GeneratedTest {

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

}