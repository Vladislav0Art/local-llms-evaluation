package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeTagTest {

    @Test
    public void decodeTagTest() throws Exception {
        ByteBuf buf = Unpooled.buffer();
        buf.writeShortLE(480);

        BaseProtocolDecoder decoder = Mockito.mock(BaseProtocolDecoder.class, Mockito.CALLS_REAL_METHODS);

        Map<Integer, String> stringMap = Mockito.spy(Map.class);
        stringMap.put(90, "can16BitR4");

        Field stringFieldsField = decoder.getClass().getDeclaredField("stringFields");
        stringFieldsField.setAccessible(true);
        stringFieldsField.set(decoder, stringMap);

        Method method = decoder.getClass().getDeclaredMethod("readValue", Position.class, String.class, ByteBuf.class, boolean.class);
        method.setAccessible(true);
        method.invoke(decoder, new Position(), "can16BitR4", buf, true);

        assertEquals(480, (int) stringMap.get("can16BitR4"));
    }

}