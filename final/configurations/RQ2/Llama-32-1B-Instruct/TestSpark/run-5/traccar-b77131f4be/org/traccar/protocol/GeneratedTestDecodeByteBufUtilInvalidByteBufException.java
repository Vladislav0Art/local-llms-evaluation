package org.traccar.protocol;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTestDecodeByteBufUtilInvalidByteBufException {

    public String decode(byte[] data) throws Exception {
        return Main.class.getName() + ": " + Arrays.deepToString(data);
    }

    @Test
    public void testDecodeByteBufUtilInvalidByteBufException() {
        try {
            new Main().decode(new byte[]{1, 2, 3});
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected exception
        }
    }

}