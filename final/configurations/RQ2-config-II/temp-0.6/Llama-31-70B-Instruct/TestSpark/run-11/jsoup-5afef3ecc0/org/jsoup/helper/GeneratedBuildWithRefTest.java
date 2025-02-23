package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedBuildWithRefTest {

    @Test
    public void buildWithRefTest() {
        URL inputUrl = URLTestUtils.createMockUrl("http", "example.com", "/test", null, "ref");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL resultUrl = urlBuilder.build();

        assertEquals("http://example.com/test#ref", resultUrl.toExternalForm());
    }

}