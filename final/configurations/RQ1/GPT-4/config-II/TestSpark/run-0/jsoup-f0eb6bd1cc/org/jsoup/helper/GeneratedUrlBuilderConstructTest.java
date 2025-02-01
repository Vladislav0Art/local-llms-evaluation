package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedUrlBuilderConstructTest {

    @Test
    public void urlBuilderConstructTest() throws Exception {
        URL url = new URL("http://test.com?q=abc");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(urlBuilder.u, url);
        assertEquals(urlBuilder.q.toString(), "abc");
    }

}