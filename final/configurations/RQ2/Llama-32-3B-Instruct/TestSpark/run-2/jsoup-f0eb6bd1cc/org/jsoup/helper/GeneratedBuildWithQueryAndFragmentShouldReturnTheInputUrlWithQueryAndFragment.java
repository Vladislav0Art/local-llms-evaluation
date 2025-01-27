package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.IDN;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;

public class GeneratedBuildWithQueryAndFragmentShouldReturnTheInputUrlWithQueryAndFragment {

    @Test
    public void buildWithQueryAndFragmentShouldReturnTheInputUrlWithQueryAndFragment() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com?query=string#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals(inputUrl, outputUrl);
    }

}