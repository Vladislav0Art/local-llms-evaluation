package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedTestInvalidUrl {

    private String url;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public String buildUrl() {
        return url;
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Main {

    @Test
    public void testInvalidUrl() throws java.net.MalformedURLException {
        new UrlBuilder("invalid://example.com");
    }

}