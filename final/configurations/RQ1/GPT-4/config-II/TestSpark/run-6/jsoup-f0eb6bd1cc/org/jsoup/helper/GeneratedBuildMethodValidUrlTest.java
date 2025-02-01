package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.net.URL;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedBuildMethodValidUrlTest {

    @Test
    public void buildMethodValidUrlTest() throws Exception {
        URL url = new URL("https://www.facebook.com");
        UrlBuilder builder = new UrlBuilder(url);
        URL newUrl = builder.build();
        assertEquals(new URL("https://www.facebook.com"), newUrl);
    }

}