package org.jsoup.helper;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void newUrlBuilder_emptyUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertNotNull(urlBuilder.build());
    }

}