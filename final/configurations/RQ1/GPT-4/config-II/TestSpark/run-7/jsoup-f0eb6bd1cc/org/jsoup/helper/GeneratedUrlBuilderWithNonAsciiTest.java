package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedUrlBuilderWithNonAsciiTest {

    @Test
    public void urlBuilderWithNonAsciiTest() throws Exception {
        URL url = new URL("https://www.example.com/é");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultUrl = urlBuilder.build();
        assertNotNull(resultUrl);
        assertEquals("https://www.example.com/%C3%A9", resultUrl.toString());
    }

}