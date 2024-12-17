package org.jsoup.helper;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedBuildNormalUrlTest {

    private URI url;

    public UrlBuilder(String url) throws MalformedURLException {
        this.url = new URI(url);
    }

    public URL build() throws MalformedURLException {
        return new URL(this.url);
    }
}

class GeneratedTest {

    @Test
    public void buildNormalUrlTest() throws MalformedURLException, URISyntaxException {
        String url = "http://example.com/path?a=1&b=2";
        UrlBuilder builder = new UrlBuilder(url);
        URL outputUrl = builder.build();
        assertEquals("http://example.com/path", outputUrl.toURI().toString());
    }

}