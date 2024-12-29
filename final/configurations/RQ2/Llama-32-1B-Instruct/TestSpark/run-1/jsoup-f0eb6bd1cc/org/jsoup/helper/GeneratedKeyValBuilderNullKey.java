package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedKeyValBuilderNullKey {

    private final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void keyValBuilderNullKey() {
        try {
            builder.appendKeyVal(new KeyVal.Builder().setUrl(null).setValue("value"));
            fail("Expected an exception to be thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

}