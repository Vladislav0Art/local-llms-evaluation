package org.traccar.protocol;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTestDecodeValidBytes {

    public String decode(byte[] data) throws Exception {
        return Main.class.getName() + ": " + Arrays.deepToString(data);
    }

    @Test
    public void testDecodeValidBytes() {
        byte[] data = new byte[]{1, 2, 3};
        System.out.println(Main.decode(data));
    }

}