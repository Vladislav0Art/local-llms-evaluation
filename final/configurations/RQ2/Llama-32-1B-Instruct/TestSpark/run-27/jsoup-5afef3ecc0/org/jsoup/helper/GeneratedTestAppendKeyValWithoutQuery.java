package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.URLDecoder;
import org.jsoup.internal.StringUtil;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GeneratedTestAppendKeyValWithoutQuery {

    public UrlBuilder newUrlBuilder() {
        return new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyValWithoutQuery() {
        UrlBuilder urlBuilder = newUrlBuilder();
        when(inputUrl.getKey()).thenReturn("key");
        URL inputUrl = "https://example.com/path";
        when(inputUrl.getValue()).thenReturn("value");

        String key = urlBuilder.appendKeyVal(new org.jsoup.util.StringUtil.StringValue("key"));
        assertEquals("key", key, "Incorrect value");

        assertNotEquals("", (String) urlBuilder.appendKeyVal(null));
    }

}