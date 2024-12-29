package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedKeyValBuilderNullInput {

    private final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void keyValBuilderNullInput() {
        try {
            builder.appendKeyVal(new KeyVal.Builder().setUrl(null).build());
            fail("Expected an exception to be thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}