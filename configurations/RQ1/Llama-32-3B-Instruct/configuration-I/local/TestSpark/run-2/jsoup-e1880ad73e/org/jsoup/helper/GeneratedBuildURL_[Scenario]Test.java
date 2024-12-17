package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedBuildURL_[Scenario]

Test {

    @Test
    public void buildURL_[ Scenario]Test() {
        URL url = new URL("http://example.com/path?query=value#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        URL normalizedUrl = builder.build();
        assertNotNull(normalizedUrl);
        assertEquals("http://example.com/path", normalizedUrl.toString());
    }

}