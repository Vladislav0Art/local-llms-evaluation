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

public class GeneratedTestAppendKeyValWithNoKey {

    public UrlBuilder newUrlBuilder() {
        return new UrlBuilder(null);
    }

    @Test
    public void testAppendKeyValWithNoKey() {
        UrlBuilder urlBuilder = newUrlBuilder();
        URL inputUrl = "https://example.com/path?query=param";

        String key1 = urlBuilder.appendKeyVal(new org.jsoup.util.StringUtil.StringValue("key1"));
        assertEquals("key1", key1, "Incorrect value");
    }

}