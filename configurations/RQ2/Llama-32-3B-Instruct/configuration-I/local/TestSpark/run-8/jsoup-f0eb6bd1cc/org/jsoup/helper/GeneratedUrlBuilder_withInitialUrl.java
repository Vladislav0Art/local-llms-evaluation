package org.jsoup.helper;

import org.jsoup.helper.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder.UnsupportedEncodingException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedUrlBuilder_withInitialUrl {

    @Test
    public void UrlBuilder_withInitialUrl() {
        URL url = new URL("https://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals(url, builder.build());
    }

}