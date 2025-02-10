package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder.DataKeyValTestHelper;

public class GeneratedAppendUrlQueryParam {

    @Test
    public void appendUrlQueryParam() throws MalformedURLException, URISyntaxException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        String result = UrlBuilder.appendUrlQueryParam(builder, "key", "value");
        assertEquals("?key=value", result);
    }

}