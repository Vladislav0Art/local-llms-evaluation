package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildURL_[NonASCIIPath]

Test {

    @Test
    public void buildURL_[ NonASCIIPath]Test() {
        String nonASCIIPath = "\u00E9\u00F5\u0308"; // eumma with U+0308 (comb above)
        URL url = new URL("http://example.com/" + nonASCIIPath + "?query=value#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        URL normalizedUrl = builder.build();
        assertNotNull(normalizedUrl);
        assertTrue(normalizedUrl.toString().contains("%E9%EF%F8"));
    }

}