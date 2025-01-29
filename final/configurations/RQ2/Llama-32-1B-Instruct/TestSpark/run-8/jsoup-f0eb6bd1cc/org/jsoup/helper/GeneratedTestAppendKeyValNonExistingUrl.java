package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestAppendKeyValNonExistingUrl {

    @Test
    public void testAppendKeyValNonExistingUrl() throws MalformedURLException {
        UrlBuilder builder = new UrlBuilder("https://example.com/non/existing-url");
        try {
            Connection.KeyVal kv = new Connection.KeyVal("key", "value");
            builder.appendKeyVal(kv);
            String result = builder.build().toString();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}