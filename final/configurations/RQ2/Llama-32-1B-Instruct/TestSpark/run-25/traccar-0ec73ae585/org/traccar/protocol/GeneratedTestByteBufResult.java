package org.traccar.protocol;

import org.junit.Test;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class GeneratedTestByteBufResult {

    @Test
    public void testByteBufResult() {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int result = (int) new ByteBuf(buffer).get();
        System.out.println(result);
    }

}