package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GeneratedTestBuildUrl_WithNoAppendKeyVal {

    private final URLBuilder urlBuilder = new UrlBuilder();

    @Test
    public void testBuildUrl_WithNoAppendKeyVal() {
        URLBuilder.Result result = urlBuilder.build();
        assertNotNull(result);
    }

}