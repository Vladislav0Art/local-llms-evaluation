package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GeneratedTestBuildUrl_WithValidKeyVal {

    private final URLBuilder urlBuilder = new UrlBuilder();

    @Test
    public void testBuildUrl_WithValidKeyVal() {
        URLBuilder.Result result = urlBuilder.build();
        assertNotNull(result);
    }

}