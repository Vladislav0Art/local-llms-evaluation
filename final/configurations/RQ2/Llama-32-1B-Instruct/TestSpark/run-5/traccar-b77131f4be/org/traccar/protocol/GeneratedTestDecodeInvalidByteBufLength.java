package org.traccar.protocol;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTestDecodeInvalidByteBufLength {

    public String decode(byte[] data) throws Exception {
        return Main.class.getName() + ": " + Arrays.deepToString(data);
    }

    @Test
    public void testDecodeInvalidByteBufLength() throws Exception {
        try {
            Main.decode(new byte[0]);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected exception
        }
    }

}