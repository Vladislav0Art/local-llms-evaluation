package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.jsoup.helper.DataUtil.UTF_8;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedBuild_RefTest {

    @Test
    public void build_RefTest() {
        try {
            URL inputUrl = new URL("http://example.com/path#anchor");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            URL result = urlBuilder.build();
            assertNotNull(result);
            assertEquals("http://xn--example.com/path#anchor", result.toString());
        } catch (MalformedURLException e) {
            assertThrows(MalformedURLException.class, () -> new URL("http://example.com/path#anchor"));
        }
    }

}