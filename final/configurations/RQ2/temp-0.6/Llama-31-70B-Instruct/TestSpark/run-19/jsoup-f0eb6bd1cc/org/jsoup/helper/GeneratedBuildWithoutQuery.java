package org.jsoup.helper;

import org.jsoup.helper.DataUtil;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedBuildWithoutQuery {

    private static final String URL_STRING = "http://example.com/path?query=value#fragment";

    @Test
    public void buildWithoutQuery() throws MalformedURLException {
        URL url = new URL("http://example.com/path#fragment");
        UrlBuilder builder = new UrlBuilder(url);
        URL normalizedUrl = builder.build();
        assertEquals("http://example.com/path#fragment", normalizedUrl.toString());
    }

}