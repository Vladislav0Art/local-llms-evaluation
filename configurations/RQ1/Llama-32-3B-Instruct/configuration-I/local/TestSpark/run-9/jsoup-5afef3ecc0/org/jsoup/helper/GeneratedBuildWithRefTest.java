package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildWithRefTest {

    @Test
    public void buildWithRefTest() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?a=1&b=2";
        URL inputUrl = new URL(url);
        inputUrl.setRef("123");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL outputUrl = builder.build();
        assertNotNull(outputUrl.getRef());
    }

}