package org.jsoup.helper;

import org.jsoup.helper.URL;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

public class GeneratedUrlBuilder.

BuildUrlWithFragmentAndAnchor {

    @Test
    public void urlBuilder.BuildUrlWithFragmentAndAnchor() {
        String scheme = "https";
        String fragment = "#anchor";
        assertEquals(scheme + "#" + fragment, new UrlBuilder(new URL(scheme + "://example.com" + fragment)).build().getScheme() + "://" + new URL(scheme + "://example.com" + fragment).getFragment());
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