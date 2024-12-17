package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedDecodePartWithInvalidEncodedString_ThrowsRuntimeException {

    @Test
    public void decodePartWithInvalidEncodedString_ThrowsRuntimeException() {
        String encoded = "invalid:encoded:string";
        try {
            UrlBuilder.decodePart(encoded);
            assert false;
        } catch (RuntimeException e) {
            // Expected
        }
    }

}