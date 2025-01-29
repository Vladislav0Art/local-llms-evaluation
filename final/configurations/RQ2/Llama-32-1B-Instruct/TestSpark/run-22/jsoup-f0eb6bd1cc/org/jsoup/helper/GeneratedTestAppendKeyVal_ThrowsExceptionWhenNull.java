package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Arrays;

public class GeneratedTestAppendKeyVal_ThrowsExceptionWhenNull {

    public class UriTest {
        private final String inputUrl = "http://example.com/path?query=value";
        private final URL inputURL = new URI("http://example.com/path", null, null);

        @Test
        public void testAppendKeyVal_ThrowsExceptionWhenNull() {
            UriTest input = new UriTest();
            assertThrows(NullPointerException.class, () -> input.appendKeyVal(null));
        }
    }

}