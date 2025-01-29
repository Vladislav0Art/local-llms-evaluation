package org.traccar.protocol;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTestDecodeInvalidByteBufElements {

    public String decode(byte[] data) throws Exception {
        return Main.class.getName() + ": " + Arrays.deepToString(data);
    }

    @Test
    public void testDecodeInvalidByteBufElements() throws Exception {
        try {
            new Main().decode(new byte[]{1, 2, 3.5, true});
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected exception
        }
    }

}