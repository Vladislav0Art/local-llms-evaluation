package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedAppendKeyValWithInvalidKey_ThrowsUnsupportedEncodingException {

    @Test
    public void appendKeyValWithInvalidKey_ThrowsUnsupportedEncodingException() {
        Connection.KeyVal kv = new Connection.KeyVal(null, "value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com/path/to/resource"));
        try {
            urlBuilder.appendKeyVal(kv);
            assert false;
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}