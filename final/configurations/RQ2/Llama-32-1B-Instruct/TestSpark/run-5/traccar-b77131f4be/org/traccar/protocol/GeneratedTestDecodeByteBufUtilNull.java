package org.traccar.protocol;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTestDecodeByteBufUtilNull {

    public String decode(byte[] data) throws Exception {
        return Main.class.getName() + ": " + Arrays.deepToString(data);
    }

    @Test
    public void testDecodeByteBufUtilNull() throws Exception {
        new Main();
        throw new NullPointerException();
    }

}