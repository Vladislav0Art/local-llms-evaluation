package org.jsoup.helper;

import org.jsoup.helper.URL;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

public class GeneratedUrlBuilder_Build_WithUrl_ReturnsUrl {

    @Test
    public void urlBuilder_Build_WithUrl_ReturnsUrl() throws MalformedURLException {
        URL inputUrl = new URL("http://localhost");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String result = urlBuilder.build();
        assert (result != null);
    }
}

public class UrlBuilder {
    private final URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public String build() {
        // implement url building logic here
        return null; // TODO: implement url building logic
    }

    public String getScheme() {
        return url.getProtocol();
    }

    public String getPath() {
        return url.getPath();
    }

    public String getQuery() {
        return url.getQuery();
    }

    public String getFragment() {
        return url.getFragment();
    }

}