package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class GeneratedBuildUrlFromEmptyUrl {

    @Test
    public void buildUrlFromEmptyUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        URL url = urlBuilder.build();
        assertEquals("http://example.com", url.toString());
    }

}