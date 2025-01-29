package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class GeneratedTestBuildUrl {

    @Test
    public void testBuildUrl() {
        String input = "https://example.com/path?param1=value1&param2=value2";
        URLBuilder urlBuilder = new UrlBuilder(new URI(input));
        URL result = urlBuilder.build();
        assertEquals("https://example.com/path", result.getProtocol());
        assertEquals("path", result.getPath());
    }

}