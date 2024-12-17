package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedAppendKeyVal_[NonASCIIValue]

Test {

    @Test
    public void appendKeyVal_[ NonASCIIValue]Test() throws UnsupportedEncodingException {
        String nonASCIIValue = "\u00E9\u00F5\u0308"; // eumma with U+0308 (comb above)
        Connection.KeyVal kv = new Connection.KeyVal("key", nonASCIIValue);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));
        builder.appendKeyVal(kv);
        assertNotNull(builder.q);
        assertTrue(builder.q.toString().contains("%E9%EF%F8"));
    }

}