package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testBuild() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com/some_path?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();

        assertNotNull(outputUrl);
        assertEquals("http://example.com/some_path?key=value", outputUrl.toExternalForm());
    }

}