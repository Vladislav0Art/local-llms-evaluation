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

public class GeneratedUrlBuilderWithEmptyUrl {

    @Test
    public void UrlBuilderWithEmptyUrl() {
        URL url = new URL("");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("", builder.build().toString(), false);
    }

}