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

public class GeneratedAppendUrlParam {

    @Test
    public void appendUrlParam() throws MalformedURLException, URISyntaxException, UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com?param1=value1"));
        String result = UrlBuilder.appendUrlParam(builder, "param2", "value2");
        assertEquals("?param1=value1&param2=value2", result);
    }

}