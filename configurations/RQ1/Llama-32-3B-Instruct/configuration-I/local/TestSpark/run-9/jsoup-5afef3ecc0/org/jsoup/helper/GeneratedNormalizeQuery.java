package org.jsoup.helper;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalizeQuery {

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
    public void normalizeQuery() {
        String query = "a=1&b=2";
        assertEquals("", UrlBuilder.normalizeQuery(query));
    }

}