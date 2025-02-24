package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildWithMalformedInputUrlTest {

    @Test
    public void buildWithMalformedInputUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("malformed url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

}