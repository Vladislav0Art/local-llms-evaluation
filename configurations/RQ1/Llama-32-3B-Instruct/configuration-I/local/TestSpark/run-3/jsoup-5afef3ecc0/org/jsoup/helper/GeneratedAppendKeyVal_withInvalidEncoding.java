package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Map;

public class GeneratedAppendKeyVal_withInvalidEncoding {

    @Test
    public void appendKeyVal_withInvalidEncoding() {
        try {
            Connection.KeyVal kv = new Connection.KeyVal("key", "value");
            UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));
            builder.appendKeyVal(kv);
            fail("Expected UnsupportedEncodingException");
        } catch (UnsupportedEncodingException e) {
        }
    }

}