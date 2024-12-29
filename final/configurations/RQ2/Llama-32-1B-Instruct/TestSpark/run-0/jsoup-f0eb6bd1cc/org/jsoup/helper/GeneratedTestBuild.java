package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com/path/to/resource";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertEquals("https://example.com/path/to/resource", urlBuilder.build().toString());
    }

}